package baseGame.beans;

import baseGame.Enums.BeanEnum;
import baseGame.interfaces.ICharacter;

public class NeutralCharacter extends ICharacter {

	private boolean estoyVivo;
	private int nivel;
	private int vidaBase;
	private int vidaMaxima;
	private int ataqueBase;
	private boolean isColissionable;

	public NeutralCharacter() {

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

	@Override
	public String PrintIcon() {
		return BeanEnum.NEUTRAL_CHARACTER.toString();
	}

	@Override
	public String ControlColission() {
		return "Aqu� el flow sube al m�ximo y te curas";

	}

	@Override
	public Boolean IsColisionable() {
		return isColissionable;
	}

	public void setColissionable(boolean isColissionable) {
		this.isColissionable = isColissionable;
	}
}
