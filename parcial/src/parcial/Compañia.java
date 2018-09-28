package parcial;

import java.util.ArrayList;

public class Compañia{
	private ArrayList <Producto> productos; 
	private ArrayList <String> observaciones;
	
	public boolean esOrganico (Producto p){
		for ( int i = 0; i < observaciones.size(); i++) {
			if ( p.tieneObservacion(observaciones.get(i))){
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Producto> listarProductos (Huerta h){
		ArrayList <Producto> aux = new ArrayList<>();
		for (int i = 0 ; i < productos.size(); i++){
			if (h.aceptaProducto(productos.get(i))){
				aux.add(productos.get(i));
			}
		}
		return aux;
	}
	public double determinarPrecio(Producto p, Huerta h){
		return p.getPrecio() - (p.getPrecio() * h.getDescuento());
	}
}
