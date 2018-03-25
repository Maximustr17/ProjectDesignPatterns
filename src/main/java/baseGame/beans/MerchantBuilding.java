package baseGame.beans;

import baseGame.Enums.MapEnum;
import baseGame.interfaces.IBuilding;

public class MerchantBuilding implements IBuilding {

    private boolean isColissionable;

    public MerchantBuilding() {
        isColissionable = true;
    }

    @Override
    public String printIcon() {
        return MapEnum.MERCHANT_BUILDING.toString();
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
