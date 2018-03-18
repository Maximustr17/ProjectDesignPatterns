package baseGame.beans;

import baseGame.Enums.Element;
import baseGame.interfaces.IElement;

public class Wall implements IElement {

	@Override
	public String PrintIcon() {
		return Element.Wall.toString();
	}

	@Override
	public String ControlColission() {
		return "no prro por aquí no se puede pasar";
	}

}
