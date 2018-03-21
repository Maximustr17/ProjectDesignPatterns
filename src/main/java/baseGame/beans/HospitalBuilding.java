package baseGame.beans;

import baseGame.Enums.BeanEnum;
import baseGame.interfaces.IBuilding;

public class HospitalBuilding implements IBuilding {

	private boolean isColissionable;

	@Override
	public String PrintIcon() {
		return BeanEnum.HOSPITAL_BUILDING.toString();
	}

	@Override
	public String ControlColission() {
		return "Aqu� el flow sube al m�ximo y te curas";
	}

	@Override
	public Boolean IsColisionable() {
		return isColissionable;
	}

	public void setColissionable(boolean isColissionable) {
		this.isColissionable = isColissionable;
	}
}
