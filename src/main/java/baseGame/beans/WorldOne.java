package baseGame.beans;

import baseGame.Enums.MapEnum;
import baseGame.Enums.FactoryEnum;
import baseGame.factories.MainFactory;
import baseGame.factories.MainFactoryProducer;
import baseGame.interfaces.*;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static baseGame.Enums.MapEnum.WALL_TERRAIN;

public class WorldOne extends IWorld {
    static WorldOne instance;
    private MainFactory terrainFactory;
    private MainFactory itemFactory;
    private MainFactory buildingFactory;
    private MainFactory characterFactory;
    private List<List<IElement>> map;
    private List<IMission> missions;

    private WorldOne() {
    }

    public static WorldOne getInstance() {
        if (instance == null) {
            instance = new WorldOne();
            instance.init();
        }
        return instance;
    }

    protected void init() {
        terrainFactory = MainFactoryProducer.getFactory(FactoryEnum.TERRAIN_FACTORY.toString());
        itemFactory = MainFactoryProducer.getFactory(FactoryEnum.ITEM_FACTORY.toString());
        buildingFactory = MainFactoryProducer.getFactory(FactoryEnum.BUILDING_FACTORY.toString());
        characterFactory = MainFactoryProducer.getFactory(FactoryEnum.CHARACTER_FACTORY.toString());
        setMap();
    }


    @Override
    public void updateCharacterRace(String race, MapEnum mapEnum) {
        ICharacter iCharacter = lookForICharacter(mapEnum);
        iCharacter.setRace(race);

        updateCharacterInstanceInMap(iCharacter);
    }

    private void updateCharacterInstanceInMap(ICharacter iCharacter) {


    }

    private ICharacter lookForICharacter(MapEnum elementId) {
        ICharacter result = null;
        for(List<IElement> row: map){
            for(IElement iElement : row){
               if(iElement.printIcon().equals(elementId.toString())){
                   result = (ICharacter) iElement;
                   break;
               }
            }
        }

        return result;

    }

    protected void setMap() {
        map = new ArrayList<>();
        List<IElement> row;
        String rowElements[];

        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("maps/map1.txt");

        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                if(line.isEmpty()) {
                    continue;
                }
                row = new ArrayList<>();
                rowElements = line.trim().split(",");
                for (String value : rowElements) {
                    switch (MapEnum.GetEnum(value)) {
                        case WALL_TERRAIN:
                            row.add(terrainFactory.getTerrain(WALL_TERRAIN.toString()));
                            break;
                        case GROUND_TERRAIN:
                            row.add(terrainFactory.getTerrain(MapEnum.GROUND_TERRAIN.toString()));
                            break;
                        case CATZURA_CHARACTER:
                            row.add(characterFactory.getCharacter(MapEnum.CATZURA_CHARACTER.toString()));
                            break;
                        case DOGGO_CHARACTER:
                            row.add(characterFactory.getCharacter(MapEnum.DOGGO_CHARACTER.toString()));
                            break;
                        case NEO_CHARACTER:
                            row.add(characterFactory.getCharacter(MapEnum.NEO_CHARACTER.toString()));
                            break;
                        case MERCHANT_BUILDING:
                            row.add(buildingFactory.getBuilding(MapEnum.MERCHANT_BUILDING.toString()));
                        case HEALTH_ITEM:
                            row.add(itemFactory.getItem(MapEnum.HEALTH_ITEM.toString()));
                    }
                }
                map.add(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<List<IElement>> getMap() {
        return map;
    }
}
