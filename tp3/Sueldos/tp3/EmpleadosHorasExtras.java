package tp3;

public class EmpleadosHorasExtras extends Empleado {
	public int horasExtras;
	public double precioHoras;

	public EmpleadosHorasExtras(double sueldo, int horasExtras, double precioHoras) {
		super(sueldo);
		this.horasExtras = horasExtras;
		this.precioHoras = precioHoras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setPrecioHoras(double precioHoras) {
		this.precioHoras = precioHoras;
	}

	public double getPrecioHoras() {
		return horasExtras;
	}

	public double salarioExtra() {
		return horasExtras * precioHoras;
	}

	public double getSueldo(double sueldo) {
		return sueldo + salarioExtra();
	}
}
