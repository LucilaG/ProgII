package tp5.eje1;

public abstract class ObraSocial {
 protected String nombre;
 protected double descuento;
 public ObraSocial(String nombre, double descuento) {
	 this.setNombre(nombre);
	 this.setDescuento(descuento);
 }
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getDescuento() {
	return descuento;
}
public void setDescuento(double descuento) {
	this.descuento = descuento;
}
 
}
