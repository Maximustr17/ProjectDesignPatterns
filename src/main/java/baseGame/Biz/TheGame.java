package baseGame.Biz;

import baseGame.beans.World;
import baseGame.interfaces.IWorld;

public class TheGame {

	IWorld world;

	public TheGame(int level) {
		world = new World(level);
	}

}
