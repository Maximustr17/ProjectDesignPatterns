package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.StealthRace;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class RaceFactory extends GameFactory {

	private static RaceFactory instance = null;
	private RaceFactory() {
		//Exists only to defeat instantiation.
	}
	
	public static RaceFactory getInstance() {
		
		if(instance == null) {
			instance = new RaceFactory();
		}
		return instance;
	}
	
	@Override
	IRace getRace(String race) {
		IRace iRace = null;

		if (race.equals(BeanEnum.STEALTH_RACE.toString())) {
			iRace = new StealthRace();
		}
		return iRace;
	}

	@Override
	IItem getItem(String item) {
		// TODO Auto-generated method stub
		return null;
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
	IHability getHability(String hability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IMission getMission(String mission) {
		// TODO Auto-generated method stub
		return null;
	}
}
