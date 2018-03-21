package baseGame.beans;

import baseGame.Enums.Element;
import baseGame.interfaces.IElement;

public class Wall implements IElement {

	private boolean isColissionable;

	@Override
	public String PrintIcon() {
		return Element.Wall.toString();
	}

	@Override
	public String ControlColission() {
		return "no prro por aqu� no se puede pasar";
	}

	public Boolean IsColisionable() {
		return isColissionable;
	}

	public Wall() {
		isColissionable = true;
	}

}
