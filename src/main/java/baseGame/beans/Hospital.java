package baseGame.beans;

import baseGame.Enums.Element;
import baseGame.interfaces.IElement;

public class Hospital implements IElement {

	private boolean isColissionable;

	@Override
	public String PrintIcon() {
		return Element.Hospital.toString();
	}

	@Override
	public String ControlColission() {
		System.out.println("Aquí el flow sube al máximo y te curas");
		setColissionable(false);
		return null;
	}

	public Boolean IsColisionable() {
		return isColissionable;
	}

	public Hospital() {
		setColissionable(true);
	}

	public void setColissionable(boolean isColissionable) {
		this.isColissionable = isColissionable;
	}
}
