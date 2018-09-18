package tp3;

import java.util.Date;

public class Futbolista extends Miembro {
	public String posicion;
	public boolean derecho;
	public int cantDeGoles;

	public Futbolista(String nombre, String apellido, int numeroDePasaporte, Date fechaDeNacimiento, String posicion,
			boolean derecho, int cantDeGoles, boolean disponibilidad) {
		super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, disponibilidad);
		this.posicion = posicion;
		this.derecho = derecho;
		this.cantDeGoles = cantDeGoles;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public boolean isDerecho() {
		return derecho;
	}

	public void setDerecho(boolean derecho) {
		this.derecho = derecho;
	}

	public int getCantDeGoles() {
		return cantDeGoles;
	}

	public void setCantDeGoles(int cantDeGoles) {
		this.cantDeGoles = cantDeGoles;
	}

}
