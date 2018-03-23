package baseGame.factories;

import baseGame.Enums.MissionEnum;
import baseGame.beans.MissionOne;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class MissionFactory extends MainFactory {
	@Override
	public IMission getMission(String mission) {
		IMission iMission = null;

		if (mission.equals(MissionEnum.MISSION_ONE.toString())) {
			iMission = new MissionOne();
		}
		return iMission;
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
	public IHability getHability(String hability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IGame getGame(String game) {
		// TODO Auto-generated method stub
		return null;
	}
}
