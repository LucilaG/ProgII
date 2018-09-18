package tp3;

import java.util.Date;

public class Masajista extends Miembro {
	public String titulo;
	public int añosExperiencia;

	public Masajista(String nombre, String apellido, int numeroDePasaporte, Date fechaDeNacimiento, boolean disponibilidad, String titulo,
			int añosExperiencia) {
		super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, disponibilidad);
		this.titulo = titulo;
		this.añosExperiencia = añosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

}
