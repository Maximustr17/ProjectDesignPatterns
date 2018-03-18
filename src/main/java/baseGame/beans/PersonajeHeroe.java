package baseGame.beans;

import baseGame.Enums.Element;
import baseGame.interfaces.IElement;

public class PersonajeHeroe implements IElement{
	private boolean isColissionable;
	
	@Override
	public String PrintIcon() {
		return Element.PersonajePrincipal.toString();
	}

	@Override
	public String ControlColission() {
		return "moviendose";

	}
	public Boolean IsColisionable() {
		return isColissionable;
	}

	public void setColissionable(boolean isColissionable) {
		this.isColissionable = isColissionable;
	}
}
