package baseGame.UI;

import baseGame.Enums.FactoryEnum;
import baseGame.Helpers.GameUIHelper;
import baseGame.Helpers.SoundClipHelper;
import baseGame.factories.MainFactory;
import baseGame.factories.MainFactoryProducer;
import baseGame.interfaces.IElement;
import baseGame.interfaces.IGame;
import baseGame.interfaces.IWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.List;

public class TheGameUI {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;
    private static GameUIHelper gameUIHelper;
    private static SoundClipHelper soundClipHelper;
    private static IGame game;
    private static MainFactory gameFactory;

    public static void main(String[] args) throws java.io.IOException {


        initUI();

        ejecutarMenuPrincipal();
    }

    private static void ejecutarMenuPrincipal() throws IOException {
        boolean noSalir;
        do {
            mostrarMenuPrincipal();
            noSalir = accionMenuPrincial(leerOpcion());
        } while (noSalir);
    }

    private static void ejecutarMenuCrearPersonaje() throws IOException {
        boolean noSalir;
        do {
            mostrarMenuPersonaje();
            noSalir = accionMenuCrearPersonaje(leerOpcion());
        } while (noSalir);
    }

    private static void initUI() {
        gameUIHelper = GameUIHelper.getInstance();
        soundClipHelper = SoundClipHelper.getInstance();
        out.println(gameUIHelper.getFile("files/gameTitle.txt"));
        soundClipHelper.playSound("soundClips/PowerBotsLoop.wav");
        gameFactory = MainFactoryProducer.getFactory(FactoryEnum.GAME_FACTORY.toString());
        game = gameFactory.getGame(FactoryEnum.GAME_FACTORY.toString());
    }

    private static void mostrarMenuPrincipal() {
        out.println("=======MAIN MENU=======");
        out.println();
        out.println("1-NEW GAME");
        out.println("2-LOAD GAME");
        out.println("3-EXIT");
        out.println();
    }

    private static void mostrarMenuPersonaje() {
        out.println("=======CREATE CHARACTER=======");
        out.println();
        out.println("1-CREATE CHARACTER");
        out.println("3-EXIT");
        out.println();
    }

    private static String leerOpcion() throws java.io.IOException {
        out.println("SELECCIONE UNA OPCIÓN:");
        out.println();
        return in.readLine();
    }

    private static boolean accionMenuPrincial(String popcion) throws IOException {
        boolean noSalir = true;
        switch (popcion) {
            case "1":
                ejecutarMenuCrearPersonaje();
                break;
            case "2":
            case "3":
                noSalir = false;
                break;
        }
        return noSalir;
    }

    private static boolean accionMenuCrearPersonaje(String popcion) throws IOException {
        boolean noSalir = true;
        switch (popcion) {
            case "1":

                break;
            case "2":
                noSalir = false;
                break;
        }
        return noSalir;
    }

    private static void printWorldMap(){
        IWorld iWorld = game.getWorls().get(0);
        List<List<IElement>> map = iWorld.getMap();
        for(List<IElement> row : map){
            for(IElement iElement : row){
                if (iElement.printIcon().equals("  ") || iElement.printIcon().equals("||")) {
                    System.out.print(iElement.printIcon());
                }else{
                    System.out.print(iElement.printIcon()+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("C = Catzura, N = Neo,  D = Doggos, H = Health potion");
        System.out.println();
    }
}
