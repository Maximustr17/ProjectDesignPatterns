package baseGame.beans;

import baseGame.Enums.Element;
import baseGame.interfaces.IElement;

public class Ground implements IElement {

	@Override
	public String PrintIcon() {
		return Element.Ground.toString();
	}

	@Override
	public String ControlColission() {
		return "Puedes caminar tranquilo prro";
	}

}
