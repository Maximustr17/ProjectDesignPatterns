package baseGame.beans;

public class PersonajeEnemigo {
	
	private boolean estoyVivo;
	private int nivel;
	private int vidaBase;
	private int vidaMaxima;
	private int ataqueBase;
	
	public PersonajeEnemigo () {
		
	}
	
	public int getVidaBase() {
		return vidaBase;
	}

	public void setVidaBase(int vidaBase) {
		this.vidaBase = vidaBase;
	}

	public boolean getEstoyVivo() {
		return estoyVivo;
	}

	public void setEstoyVivo(boolean estoyVivo) {
		this.estoyVivo = estoyVivo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public int getAtaqueBase() {
		return ataqueBase;
	}

	public void setAtaqueBase(int ataqueBase) {
		this.ataqueBase = ataqueBase;
	}

}
