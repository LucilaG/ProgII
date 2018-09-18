package tp3;

import java.util.Date;
import java.io.*;

public class Miembro {
	public String nombre;
	public String apellido;
	public int numeroDePasaporte;
	public Date fechaDeNacimiento;
	public boolean disponibilidad;

	public Miembro(String nombre, String apellido, int numeroDePasaporte, Date fechaDeNacimiento,
			boolean disponibilidad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroDePasaporte = numeroDePasaporte;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.disponibilidad = disponibilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroDePasaporte() {
		return numeroDePasaporte;
	}

	public void setNumeroDePasaporte(int numeroDePasaporte) {
		this.numeroDePasaporte = numeroDePasaporte;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean estado() {
		disponibilidad = false;
		if (imprimirPosibilidades() == 3) {
			disponibilidad = true;
		}
		return disponibilidad;
	}

	public int imprimirPosibilidades() {
		int n = 5;
		try {
			do {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println(
						"¿En que estado se encuentra?\n 1. Viajando \n 2. En concentración \n 3. En país de origen");
				n = new Integer(entrada.readLine());
			} while (n > 0 && n < 4);
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return n;
	}
}
