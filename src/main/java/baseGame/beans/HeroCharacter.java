package baseGame.beans;

import baseGame.Enums.BeanEnum;
import baseGame.interfaces.ICharacter;

public class HeroCharacter extends ICharacter {
	private boolean isColissionable;

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
