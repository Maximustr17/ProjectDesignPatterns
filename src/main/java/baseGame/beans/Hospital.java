package baseGame.beans;

import baseGame.Enums.Element;
import baseGame.interfaces.IElement;

public class Hospital implements IElement {

	@Override
	public String PrintIcon() {
		return Element.Hospital.toString();
	}

	@Override
	public String ControlColission() {
		return "Aquí el flow sube al máximo y te curas";
	}

}
