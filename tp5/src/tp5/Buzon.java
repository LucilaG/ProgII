package tp5;

import java.util.ArrayList;

public class Buzon {
	public Carta carta;

	ArrayList<Integer> niniosBuenos = new ArrayList<>();
	ArrayList<Carta> cartasEnviadas = new ArrayList<>();

	public Buzon(Carta carta) {
		this.carta = carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Carta getCarta() {
		return carta;
	}

	public void isBueno() {
		if (!niniosBuenos.contains(carta.getRemitente())) {
			eliminarLista();
		}
		agregarCarta();
	}
	
	public void agregarCarta() {
		for (int i = 0; i < cartasEnviadas.size(); i++) {
			if (!(cartasEnviadas.get(i).getRemitente() == carta.getRemitente())) {
				cartasEnviadas.add(carta);
			}
		}
	}

	public void eliminarLista() {
		carta.listaDeRegalos.clear();
		carta.listaDeRegalos.add("Trozo de carbón");
	}
}