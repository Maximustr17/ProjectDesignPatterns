package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.HealthItem;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class ItemFactory extends MainFactory {

	@Override
	public IItem getItem(String item) {
		IItem iItem = null;

		if (item.equals(BeanEnum.HEALTH_ITEM.toString())) {
			iItem = new HealthItem();
		}
		return iItem;
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
