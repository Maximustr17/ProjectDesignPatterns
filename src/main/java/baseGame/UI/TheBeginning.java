package baseGame.UI;

import baseGame.beans.PersonajeHeroe;

public class TheBeginning {

	public static PersonajeHeroe MenuCrearPersonaje() {
		//TODO crear el menú de creación y de devolver el personaje heroe
		System.out.println("Creando personaje . . .");
		return new PersonajeHeroe();
	}
}
