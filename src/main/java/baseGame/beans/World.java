package baseGame.beans;

import baseGame.Builders.WorldBuilder;
import baseGame.interfaces.IElement;
import baseGame.interfaces.IWorld;

public class World implements IWorld {

	public IElement[][] mapa;

	public void LoadMap(int level) {
		mapa = WorldBuilder.BuildWorld(GetLevelPath(level));
	}

	private String GetLevelPath(int level) {
		return "maps/" + level + ".json";
	}
}
