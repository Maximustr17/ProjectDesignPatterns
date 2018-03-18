package baseGame.beans;

import baseGame.Builders.WorldBuilder;
import baseGame.interfaces.IElement;
import baseGame.interfaces.IWorld;

public class World implements IWorld {

	public IElement[][] mapa;

	public World(int level) {
		mapa = WorldBuilder.BuildWorld(GetLevelPath(level));
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
