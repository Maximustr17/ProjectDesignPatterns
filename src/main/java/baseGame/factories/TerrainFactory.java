package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.GroundTerrain;
import baseGame.beans.WallTerrain;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class TerrainFactory extends GameFactory {
	
	private static TerrainFactory instance = null;
	private TerrainFactory() {
		//Exists only to defeat instantiation.
	}
	
	public static TerrainFactory getInstance() {
		
		if(instance == null) {
			instance = new TerrainFactory();
		}
		return instance;
	}

	@Override
	ITerrain getTerrain(String terrain) {
		ITerrain iTerrain = null;

		if (terrain.equals(BeanEnum.GROUND_TERRAIN.toString())) {
			iTerrain = new GroundTerrain();
		} else if (terrain.equals(BeanEnum.WALL_TERRAIN.toString())) {
			iTerrain = new WallTerrain();
		}
		return iTerrain;
	}

	@Override
	IHability getHability(String hability) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IBuilding getBuilding(String building) {
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
	IMission getMission(String mission) {
		// TODO Auto-generated method stub
		return null;
	}
}
