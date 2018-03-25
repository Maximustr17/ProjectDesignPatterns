package baseGame.factories;

import baseGame.Enums.MapEnum;
import baseGame.beans.DoggoCharacter;
import baseGame.beans.CatzuraCharacter;
import baseGame.beans.NeoCharacter;
import baseGame.interfaces.*;

public class CharacterFactory extends MainFactory {

    @Override
    public ICharacter getCharacter(String character) {
        ICharacter iCharacter = null;

        if (character.equals(MapEnum.CATZURA_CHARACTER.toString())) {
            iCharacter = new CatzuraCharacter();
        } else if (character.equals(MapEnum.DOGGO_CHARACTER.toString())) {
            iCharacter = new DoggoCharacter();
        } else if (character.equals(MapEnum.NEO_CHARACTER.toString())) {
            iCharacter = new NeoCharacter();
        }
        return iCharacter;
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
    public IBuilding getBuilding(String building) {
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
