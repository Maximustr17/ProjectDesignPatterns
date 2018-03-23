package baseGame.UI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

import baseGame.Biz.TheGame;
import baseGame.Helpers.GameUIHelper;

public class TheGameUI {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;
	private static GameUIHelper gameUIHelper;

	public static void main(String[] args) throws java.io.IOException {

		int opc;
		boolean noSalir = true;
		initUI();

		do {
			mostrarMenuPrincipal();
			opc = leerOpcion();
			noSalir = accionMenuPrincial(opc);
		} while (opc != 4 || !noSalir);

	}
	
	public static void initUI() {
		gameUIHelper = GameUIHelper.getInstance();
		
	}

	public static void mostrarMenuPrincipal() throws java.io.IOException {
		out.println(gameUIHelper.getFile("files/gameTitle.txt"));
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
			TheGame a = new TheGame(1);
			break;

		case 2:

		case 3:
			noSalir = false;
			break;
		}
		return noSalir;
	}

}
