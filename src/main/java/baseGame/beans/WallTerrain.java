package baseGame.beans;

import baseGame.Enums.BeanEnum;
import baseGame.interfaces.ITerrain;

public class WallTerrain implements ITerrain {

	private boolean isColissionable;

	@Override
	public String PrintIcon() {
		return BeanEnum.WALL_TERRAIN.toString();
	}

	@Override
	public String ControlColission() {
		return "no prro por aqu� no se puede pasar";
	}

	@Override
	public Boolean IsColisionable() {
		return isColissionable;
	}

	public WallTerrain() {
		isColissionable = true;
	}

}
