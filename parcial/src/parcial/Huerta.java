package parcial;

import java.util.ArrayList;

public class Huerta {
	private Administrador admin;
	private ArrayList <String> plagas = new ArrayList<>();
	private double superficie;
	
	public boolean aceptaProducto (Producto p){
		for ( int i = 0; i < plagas.size(); i++) {
			if (! p.trataPlaga(plagas.get(i))){
				return false;
			}
		}
		return true;
	}
	public double getSuperficie(){
		return this.superficie;
	}
	public double getDescuento(){
		if (this.admin == null){
			return 0;
		}
		else{
			return this.admin.getDescuento();
		}
	}
}
