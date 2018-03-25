package baseGame.factories;

import baseGame.Enums.WorldEnum;
import baseGame.beans.WorldOne;
import baseGame.interfaces.*;

public class WorldFactory extends MainFactory {

    @Override
    public IWorld getWorld(String world) {
        IWorld iWorld = null;

        if (world.equals(WorldEnum.WORLD_ONE.toString())) {
            iWorld = WorldOne.getInstance();
        }
        return iWorld;
    }

    @Override
    public ITerrain getTerrain(String terrain) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IBuilding getBuilding(String building) {
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
