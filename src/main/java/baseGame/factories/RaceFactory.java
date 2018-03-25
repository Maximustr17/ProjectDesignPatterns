package baseGame.factories;

import baseGame.Enums.MapEnum;
import baseGame.Enums.RaceEnum;
import baseGame.beans.StealthRace;
import baseGame.interfaces.*;

public class RaceFactory extends MainFactory {

    @Override
    public IRace getRace(String race) {
        IRace iRace = null;

        if (race.equals(RaceEnum.STEALTH_RACE.toString())) {
            iRace = new StealthRace();
        }
        return iRace;
    }

    @Override
    public IItem getItem(String item) {
        // TODO Auto-generated method stub
        return null;
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
