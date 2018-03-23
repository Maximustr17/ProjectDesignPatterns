package baseGame.beans;

import baseGame.Enums.BeanEnum;
import baseGame.factories.BuildingFactory;
import baseGame.interfaces.ICharacter;

public class HeroCharacter extends ICharacter {
	private boolean isColissionable;
	private static HeroCharacter instance = null;
	
	private HeroCharacter() {
		//Exists only to defeat instantiation.
	}
	
	public static HeroCharacter getInstance() {
		
		if(instance == null) {
			instance = new HeroCharacter();
		}
		return instance;
	}
	@Override
	public String PrintIcon() {
		return BeanEnum.HERO_CHARACTER.toString();
	}

	@Override
	public String ControlColission() {
		return "moviendose";

	}

	@Override
	public Boolean IsColisionable() {
		return isColissionable;
	}

	public void setColissionable(boolean isColissionable) {
		this.isColissionable = isColissionable;
	}
}
