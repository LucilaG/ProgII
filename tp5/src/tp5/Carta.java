package tp5;

import java.util.ArrayList;

public class Carta {

	public int remitente;
	ArrayList<String> listaDeRegalos = new ArrayList<>();
	
	public Carta(int remitente) {
		this.remitente = remitente;
	}
	
	public void setRemitente(int remitente) {
		this.remitente = remitente;
	}
	public int getRemitente() {
		return remitente;
	}
	
}
