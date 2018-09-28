package parcial;

import java.util.ArrayList;

public class HuertaControlada extends Huerta {
	
	private ArrayList <Producto> nocivos;
	private double superficieMax;
	
	public boolean aceptaProducto(Producto p){
		if (nocivos.contains(p) && (this.getSuperficie() < superficieMax)){
			if (super.aceptaProducto(p)){
				return true;
			}
			return false;
		}
		else{
			return false;
		}
	}
}
