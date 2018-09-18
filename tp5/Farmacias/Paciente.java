
import java.util.ArrayList;

public class Paciente {
	private ObraSocial obraSocial;
	
	ArrayList<String> sintomas = new ArrayList<>();
	ArrayList<Medicamento> listaMedicamentosAlergia = new ArrayList<>();
	

	public Paciente(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	public ObraSocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	public ArrayList<String> getSintomas() {
		return sintomas;
	}

	public void setSintomas(ArrayList<String> sintomas) {
		this.sintomas = sintomas;
	}

	public ArrayList<Medicamento> getListaMedicamentosAlergia() {
		return listaMedicamentosAlergia;
	}

	public void setListaMedicamentosAlergia(ArrayList<Medicamento> listaMedicamentosAlergia) {
		this.listaMedicamentosAlergia = listaMedicamentosAlergia;
	}

	private boolean isAlergico(Medicamento medicamento) {
		return listaMedicamentosAlergia.contains(medicamento);
	}

	public boolean aceptaMedicamento(Medicamento medicamento) {
		boolean acepta = true;
		int i = 0;
		if (isAlergico(medicamento)) {
			acepta = false;
		} else {
			do {
				acepta = (!medicamento.trataSintoma(sintomas.get(i))) ? true : false;
				i++;
			} while ((acepta) || (i < sintomas.size()));
		}
		return acepta;
	}
}
