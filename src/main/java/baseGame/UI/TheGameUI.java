package baseGame.UI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import baseGame.Enums.BeanEnum;
import baseGame.Enums.FactoryEnum;
import baseGame.Enums.WorldEnum;
import baseGame.Helpers.GameUIHelper;
import baseGame.Helpers.SoundClipHelper;
import baseGame.factories.MainFactory;
import baseGame.factories.MainFactoryProducer;
import baseGame.interfaces.IGame;

public class TheGameUI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	static GameUIHelper gameUIHelper;
    static SoundClipHelper soundClipHelper;
	static IGame game;
	static MainFactory gameFactory;

	public static void main(String[] args) throws java.io.IOException {
		int opc;
		boolean noSalir = true;

		initUI();

		do {
			mostrarMenuPrincipal();
			opc = leerOpcion();
			noSalir = accionMenuPrincial(opc);
		} while (opc != 4 || noSalir);
	}

	public static void initUI() {
		gameUIHelper = GameUIHelper.getInstance();
		soundClipHelper = SoundClipHelper.getInstance();
		out.println(gameUIHelper.getFile("files/gameTitle.txt"));
		soundClipHelper.playSound("soundClips/PowerBotsLoop.wav");
		gameFactory = MainFactoryProducer.getFactory(FactoryEnum.GAME_FACTORY.toString());
		game = gameFactory.getGame(FactoryEnum.GAME_FACTORY.toString());
	}

	public static void mostrarMenuPrincipal() throws java.io.IOException {
		out.println("MENÚ PRINCIPAL");
		out.println();
		out.println("1-JUEGO NUEVO");
		out.println("2-CARGAR JUEGO");
		out.println("3-SALIR DEL JUEGO");
		out.println();
	}

	public static int leerOpcion() throws java.io.IOException {
		int opc;

		out.println("SELECCIONE UNA OPCIÓN:");
		opc = Integer.parseInt(in.readLine());
		out.println();
		return opc;
	}

	public static boolean accionMenuPrincial(int popcion) throws java.io.IOException {
		boolean noSalir = true;
		switch (popcion) {
		case 1:
			
			game.init(WorldEnum.WORLD_ONE.toString());
			break;
		case 2:
		case 3:
			noSalir = false;
			break;
		}
		return noSalir;
	}
}
