

import java.util.ArrayList;

public class Medicamento {
private String nombre;
private float precio;
ArrayList<String> sintomasATratar = new ArrayList<>();
 
public Medicamento(String nombre, float precio) {
	this.precio = precio;
	this.setNombre(nombre);
}

public float getPrecio(){
	return precio;
}

public void setPrecio(float precio) {
	this.precio = precio;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


}

