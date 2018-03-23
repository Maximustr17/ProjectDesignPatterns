package baseGame.factories;

import baseGame.Enums.MissionEnum;
import baseGame.beans.MissionOne;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class MissionFactory extends GameFactory {
	@Override
	IMission getMission(String mission) {
		IMission iMission = null;

		if (mission.equals(MissionEnum.MISSION_ONE.toString())) {
			iMission = new MissionOne();
		}
		return iMission;
	}

	@Override
	IBuilding getBuilding(String building) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	ITerrain getTerrain(String terrain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IWorld getWorld(String world) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	ICharacter getCharacter(String character) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IItem getItem(String item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IRace getRace(String race) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IHability getHability(String hability) {
		// TODO Auto-generated method stub
		return null;
	}
}
