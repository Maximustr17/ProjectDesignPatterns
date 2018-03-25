package baseGame.beans;

import baseGame.Enums.MapEnum;
import baseGame.interfaces.ITerrain;

public class GroundTerrain implements ITerrain {

    private boolean isColissionable;

    public GroundTerrain() {
        isColissionable = false;
    }

    @Override
    public String printIcon() {
        return MapEnum.GROUND_TERRAIN.toString();
    }

    @Override
    public String ControlColission() {
        return "Puedes caminar tranquilo prro";
    }

    @Override
    public Boolean IsColisionable() {
        return isColissionable;
    }

}
