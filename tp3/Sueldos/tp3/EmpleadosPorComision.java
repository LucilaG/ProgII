package tp3;

public class EmpleadosPorComision extends Empleado {
	public double ventas;
	public double comision = 0.3;

	public EmpleadosPorComision(double sueldo, double venta) {
		super(sueldo);
		this.ventas = venta;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}
	public double getVentas() {
		return ventas;
	}
	
	public double salarioExtra() {
		return ventas * comision;
	}

	public double getSueldo(double sueldo) {
		return sueldo + salarioExtra();
	}
}
