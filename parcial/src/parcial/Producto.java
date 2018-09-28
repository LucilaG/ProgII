package parcial;

import java.util.ArrayList;

public class Producto {
	private String nombre;
	private double precio;
	private ArrayList <String> plagas;
	private ArrayList <String> observaciones;
	
	public boolean trataPlaga(String plaga){
		return plagas.contains(plaga);
	}
	public String getNombre(){
		return nombre;
	}
	public boolean tieneObservacion(String observacion){
		return observaciones.contains(observacion);
	}
	public double getPrecio(){
		return this.precio;
	}
	public boolean equals(Producto p){
		return this.nombre == p.getNombre();
	}
}
