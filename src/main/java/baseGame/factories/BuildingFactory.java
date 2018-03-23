package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.HospitalBuilding;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class BuildingFactory extends GameFactory {
	
	private static BuildingFactory instance = null;
	private BuildingFactory() {
		//Exists only to defeat instantiation.
	}
	
	public static BuildingFactory getInstance() {
		
		if(instance == null) {
			instance = new BuildingFactory();
		}
		return instance;
	}
	
	@Override
	IBuilding getBuilding(String building) {
		IBuilding iBuilding = null;

		if (building.equals(BeanEnum.HOSPITAL_BUILDING.toString())) {
			iBuilding = new HospitalBuilding();
		}
		return iBuilding;
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

	@Override
	IMission getMission(String mission) {
		// TODO Auto-generated method stub
		return null;
	}
}
