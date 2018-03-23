package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.EnemyCharacter;
import baseGame.beans.HeroCharacter;
import baseGame.beans.NeutralCharacter;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class CharacterFactory extends MainFactory {

	@Override
	public ICharacter getCharacter(String character) {
		ICharacter iCharacter = null;

		if (character.equals(BeanEnum.HERO_CHARACTER.toString())) {
			iCharacter = new HeroCharacter();
		} else if (character.equals(BeanEnum.ENEMY_CHARACTER.toString())) {
			iCharacter = new EnemyCharacter();
		} else if (character.equals(BeanEnum.NEUTRAL_CHARACTER.toString())) {
			iCharacter = new NeutralCharacter();
		}
		return iCharacter;
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
	public IBuilding getBuilding(String building) {
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
