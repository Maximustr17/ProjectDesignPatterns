package baseGame.interfaces;

import baseGame.Enums.DirectionEnum;

public interface IWorld {
	void PrintAllMap();

	boolean NewPositionOfUser(DirectionEnum direction);
}
