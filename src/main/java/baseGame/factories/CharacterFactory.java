package baseGame.factories;

import baseGame.Enums.BeanEnum;
import baseGame.beans.EnemyCharacter;
import baseGame.beans.HeroCharacter;
import baseGame.beans.NeutralCharacter;
import baseGame.interfaces.IBuilding;
import baseGame.interfaces.ICharacter;
import baseGame.interfaces.IHability;
import baseGame.interfaces.IItem;
import baseGame.interfaces.IMission;
import baseGame.interfaces.IRace;
import baseGame.interfaces.ITerrain;
import baseGame.interfaces.IWorld;

public class CharacterFactory extends GameFactory {

	private static CharacterFactory instance = null;
	private CharacterFactory() {
		//Exists only to defeat instantiation.
	}
	
	public static CharacterFactory getInstance() {
		
		if(instance == null) {
			instance = new CharacterFactory();
		}
		return instance;
	}
	@Override
	ICharacter getCharacter(String character) {
		ICharacter iCharacter = null;

		if (character.equals(BeanEnum.HERO_CHARACTER.toString())) {
			iCharacter = HeroCharacter.getInstance();
		} else if (character.equals(BeanEnum.ENEMY_CHARACTER.toString())) {
			iCharacter = new EnemyCharacter();
		} else if (character.equals(BeanEnum.NEUTRAL_CHARACTER.toString())) {
			iCharacter = new NeutralCharacter();
		}
		return iCharacter;
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
	IBuilding getBuilding(String building) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IMission getMission(String mission) {
		// TODO Auto-generated method stub
		return null;
	}
}
