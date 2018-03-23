package baseGame.beans;

import baseGame.Enums.BeanEnum;
import baseGame.interfaces.ITerrain;

public class GroundTerrain implements ITerrain {

	private boolean isColissionable;

	@Override
	public String PrintIcon() {
		return BeanEnum.GROUND_TERRAIN.toString();
	}

	@Override
	public String ControlColission() {
		return "Puedes caminar tranquilo prro";
	}

	@Override
	public Boolean IsColisionable() {
		return isColissionable;
	}

	public GroundTerrain() {
		isColissionable = false;
	}

}
