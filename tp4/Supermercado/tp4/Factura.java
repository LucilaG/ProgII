package tp4;

import java.util.ArrayList;

public class Factura {
	private int descuento;
	ArrayList<ProductoComprado> productosComprados = new ArrayList<>();

	public Factura(int descuento) {
		this.descuento = descuento;
	}

	public double calcularTotal() {
		return 0.1;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public ArrayList<ProductoComprado> getProductosComprados() {
		return productosComprados;
	}

	public void setProductosComprados(ArrayList<ProductoComprado> productosComprados) {
		this.productosComprados = productosComprados;
	}

	public void unidadesDisponibles() {
	}

}
