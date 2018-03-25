package baseGame.beans;

import baseGame.Enums.MapEnum;
import baseGame.interfaces.ITerrain;

public class WallTerrain implements ITerrain {

    private boolean isColissionable;

    public WallTerrain() {
        isColissionable = true;
    }

    @Override
    public String printIcon() {
        return MapEnum.WALL_TERRAIN.toString();
    }

    @Override
    public String ControlColission() {
        return "no prro por aqu� no se puede pasar";
    }

    @Override
    public Boolean IsColisionable() {
        return isColissionable;
    }

}
