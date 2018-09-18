package tp3;

import java.util.Date;

public class Entrenador extends Miembro{
public String federacion;

	public Entrenador(String nombre, String apellido, int numeroDePasaporte, Date fechaDeNacimiento, boolean disponibilidad, String federacion) {
		super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, disponibilidad);
		this.federacion = federacion;
	}
	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}
	public String setFederacion() {
		return federacion;
	}

}
