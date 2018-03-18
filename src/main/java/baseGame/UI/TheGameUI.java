package baseGame.UI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TheGameUI {
	
	 static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 static PrintStream out = System.out;
	
	 public static void main(String[] args) throws java.io.IOException {
		 
	        int opc;
	        boolean noSalir = true;

	        do {
	            mostrarMenu();
	            opc = leerOpcion();
	            noSalir = ejecutarAccion(opc);
	        } while (opc != 4);

	    }

	   
	    public static void mostrarMenu() throws java.io.IOException {
	        
	        out.println();
	        out.println("MENÚ PRINCIPAL");
	        out.println();

	        out.println("1-Iniciar partida");

	        out.println("2- ");

	        out.println("3- ");

	        out.println("4-Salir del juego ");

	        out.println();
	    }

	 
	    public static int leerOpcion() throws java.io.IOException {

	        int opc;

	        out.println("Seleccione una opción:");
	        opc = Integer.parseInt(in.readLine());
	        out.println();

	        return opc;

	    }

	  
	    public static boolean ejecutarAccion(int popcion) throws java.io.IOException {

	        boolean noSalir = true;

	        switch (popcion) {

	            case 1:
	            
	                break;

	            case 2:
	                
	                break;

	            case 3:
	               
	                break;

	            case 4:

	                noSalir = false;

	                break;
	        }
	        return noSalir;
	    }


}
