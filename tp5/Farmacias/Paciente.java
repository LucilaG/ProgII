
import java.util.ArrayList;

public class Paciente {
	ArrayList<String> sintomas = new ArrayList<>();
	ArrayList<Medicamento> listaMedicamentosAlergia = new ArrayList<>();

	public Paciente() {}

	private boolean isAlergico() {
		return listaMedicamentosAlergia == null;
	}
	
	public boolean sintomasEnComun(Medicamento medicamento) {
		boolean comun = true;

		for (int i = 0; i < sintomas.size(); i++) {
			if (sintomas.contains(medicamento.sintomasATratar.get(i))) {
				comun = true;
			} else {
				comun = false;
			}
		}

		return comun;
	}
	
	public boolean aceptaMedicamento(Medicamento medicamento) {
		if (sintomasEnComun(medicamento) && !isAlergico()) {
			return true;
		} else if (sintomasEnComun(medicamento) && !listaMedicamentosAlergia.contains(medicamento)) {
			return true;
		} else {
			return false;
		}
	}
}

