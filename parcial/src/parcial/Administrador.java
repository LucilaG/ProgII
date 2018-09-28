package parcial;

import java.util.ArrayList;

public class Administrador {
	private double descuento;
	private ArrayList <Huerta> huertas;
	
	public double supCultivable(){
		double supTotal = 0;
		for (int i = 0; i < huertas.size(); i++){
			supTotal += huertas.get(i).getSuperficie();
		}
		return supTotal;
	}
	public double getDescuento(){
		return this.descuento;
	}
}
