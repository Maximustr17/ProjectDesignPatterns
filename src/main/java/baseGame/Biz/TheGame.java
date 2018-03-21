package baseGame.Biz;

import baseGame.Enums.Direction;
import baseGame.beans.PersonajeHeroe;
import baseGame.beans.World;
import baseGame.interfaces.IWorld;

public class TheGame {

	IWorld world;

	public TheGame(int level, PersonajeHeroe personajeHeroe) {
		world = new World(level, personajeHeroe);
	}
	
	public void PrintMap() {
		world.PrintAllMap();
	}
	
	public void MoveHero(Direction direction) {
		world.NewPositionOfUser(direction);
	}

}
