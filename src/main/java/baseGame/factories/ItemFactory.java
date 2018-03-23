package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.HealthItem;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class ItemFactory extends GameFactory {

	@Override
	IItem getItem(String item) {
		IItem iItem = null;

		if (item.equals(BeanEnum.HEALTH_ITEM.toString())) {
			iItem = new HealthItem();
		}
		return iItem;
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
