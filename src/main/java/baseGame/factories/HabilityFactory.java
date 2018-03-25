package baseGame.factories;

import baseGame.Enums.HabilityEnum;
import baseGame.Enums.MapEnum;
import baseGame.beans.StealthHability;
import baseGame.interfaces.*;

public class HabilityFactory extends MainFactory {

    @Override
    public IHability getHability(String hability) {
        IHability ihability = null;

        if (hability.equals(HabilityEnum.STEALTH_HABILITY.toString())) {
            ihability = new StealthHability();
        }
        return ihability;
    }

    @Override
    public IBuilding getBuilding(String building) {
        // TODO Auto-generated method stub
        return null;
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
