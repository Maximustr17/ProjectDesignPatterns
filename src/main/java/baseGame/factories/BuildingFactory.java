package baseGame.factories;

import baseGame.Enums.MapEnum;
import baseGame.beans.MerchantBuilding;
import baseGame.interfaces.*;

public class BuildingFactory extends MainFactory {

    @Override
    public IBuilding getBuilding(String building) {
        IBuilding iBuilding = null;

        if (building.equals(MapEnum.MERCHANT_BUILDING.toString())) {
            iBuilding = new MerchantBuilding();
        }
        return iBuilding;
    }

    @Override
    public ITerrain getTerrain(String terrain) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IWorld getWorld(String world) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ICharacter getCharacter(String character) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IItem getItem(String item) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IRace getRace(String race) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IHability getHability(String hability) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IMission getMission(String mission) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IGame getGame(String game) {
        // TODO Auto-generated method stub
        return null;
    }
}
