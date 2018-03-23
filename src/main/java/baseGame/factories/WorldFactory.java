package baseGame.factories;

import baseGame.Enums.WorldEnum;
import baseGame.beans.WorldOne;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class WorldFactory extends GameFactory {

	private static WorldFactory instance = null;
	private WorldFactory() {
		//Exists only to defeat instantiation.
	}
	
	public static WorldFactory getInstance() {
		
		if(instance == null) {
			instance = new WorldFactory();
		}
		return instance;
	}
	
	@Override
	IWorld getWorld(String world) {
		IWorld iWorld = null;

		if (world.equals(WorldEnum.WORLD_ONE.toString())) {
			iWorld = new WorldOne();
		}
		return iWorld;
	}

	@Override
	IRace getRace(String race) {
		// TODO Auto-generated method stub
		return null;
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
