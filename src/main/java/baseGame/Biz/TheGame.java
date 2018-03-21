package baseGame.Biz;

import baseGame.beans.WorldOne;
import baseGame.interfaces.IWorld;

public class TheGame {

	IWorld world;

	public TheGame(int level) {
		world = new WorldOne(level);
	}

}
