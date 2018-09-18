package tp3;

import java.util.Date;

public class Masajista extends Miembro {
	public String titulo;
	public int a�osExperiencia;

	public Masajista(String nombre, String apellido, int numeroDePasaporte, Date fechaDeNacimiento, boolean disponibilidad, String titulo,
			int a�osExperiencia) {
		super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, disponibilidad);
		this.titulo = titulo;
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

}
