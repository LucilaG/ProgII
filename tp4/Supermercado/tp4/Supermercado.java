package tp4;

import java.util.ArrayList;

public class Supermercado {
ArrayList<Factura> factura = new ArrayList<>();
ArrayList<Productos> listaProductos = new ArrayList<>();

public Supermercado() {}
public ArrayList<Productos> disponibilidadProductos() {
	return listaProductos;
}
public void dineroFacturado() {}
public void compra(Productos p, int cantidad) {}
public void recibirProducto(Productos p, int cantidad) {}

}
