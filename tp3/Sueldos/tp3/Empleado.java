package tp3;

public abstract class Empleado {
	public double sueldo;

public Empleado(double sueldo) {
	this.sueldo = sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
public double getSueldo(double sueldo) {
	return sueldo;
}
}
