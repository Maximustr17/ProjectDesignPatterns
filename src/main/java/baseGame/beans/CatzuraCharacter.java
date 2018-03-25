package baseGame.beans;

import baseGame.Enums.MapEnum;
import baseGame.interfaces.ICharacter;

public class CatzuraCharacter extends ICharacter {
    private boolean isColissionable;

    @Override
    public String printIcon() {
        return MapEnum.CATZURA_CHARACTER.toString();
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

    @Override
    public void setRace(String race) {



    }
}
