package baseGame.beans;

import baseGame.Builders.WorldBuilder;
import baseGame.Enums.Direction;
import baseGame.interfaces.IElement;
import baseGame.interfaces.IWorld;

public class World implements IWorld {

	public IElement[][] mapa;
	public int heroPosX;
	public int heroPosY;

	public World(int level) {
		mapa = WorldBuilder.BuildWorld(GetLevelPath(level));
		getPositionOfHero();
	}

	private void getPositionOfHero() {
		for (int i = 0; i < mapa.length; i++)
			for (int j = 0; j < mapa[0].length; j++)
				if (mapa[i][j].getClass().isInstance(new PersonajeHeroe())) {
					heroPosX = j;
					heroPosY = i;
				}
	}

	public boolean NewPositionOfUser(Direction direction) {
		int x = heroPosX;
		int y = heroPosY;
		
		switch (direction) {
		case DOWN:
			y = heroPosY + 1;
			break;
		case UP:
			y = heroPosY - 1;
			break;
		case LEFT:
			x = heroPosX + 1;
			break;
		case RIGTH:
			x = heroPosX - 1;
			break;
		}

		IElement elementToGo = mapa[y][x];
		if (elementToGo.IsColisionable())
			elementToGo.ControlColission();
		else {
			mapa[y][x] = mapa[heroPosY][heroPosX];
			mapa[heroPosY][heroPosX] = new Ground();
			heroPosX = x;
			heroPosY = y;
		}
		return true;
	}

	public void PrintAllMap() {
		PrintLines();
		System.out.println("");
		for (int i = 0; i < mapa.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < mapa[0].length; j++)
				System.out.print(mapa[i][j].PrintIcon() + " | ");
			System.out.println("");
			PrintLines();
			System.out.println("");
		}
	}

	private void PrintLines() {
		for (int x = 0; x < mapa[0].length; x++)
			System.out.print("----");
	}

	private String GetLevelPath(int level) {
		return "maps/" + level + ".json";
	}
}
