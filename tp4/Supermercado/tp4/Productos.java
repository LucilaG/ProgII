package tp4;

import java.util.ArrayList;

public class Productos {
	private double precio;
	private int stock;
	private int minPermitido;
	ArrayList<Impuestos> impuestos = new ArrayList<>();

	public Productos(double precio, int stock, int minPermitido) {
		this.precio = precio;
		this.stock = stock;
		this.minPermitido = minPermitido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getMinPermitido() {
		return minPermitido;
	}

	public void setMinPermitido(int minPermitido) {
		this.minPermitido = minPermitido;
	}

	public ArrayList<Impuestos> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(ArrayList<Impuestos> impuestos) {
		this.impuestos = impuestos;
	}

}
