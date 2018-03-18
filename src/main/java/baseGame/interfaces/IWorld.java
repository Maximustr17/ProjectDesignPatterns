package baseGame.interfaces;

import baseGame.Enums.Direction;

public interface IWorld {
	void PrintAllMap();

	boolean NewPositionOfUser(Direction direction);
	}
