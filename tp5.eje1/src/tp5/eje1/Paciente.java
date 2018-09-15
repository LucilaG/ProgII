package tp5.eje1;

import java.util.ArrayList;

public class Paciente {
	private Medicamento medicamento;
	private float precio;
	private boolean alergico;
	ArrayList<String> sintomas = new ArrayList<>();
	ArrayList<Medicamento> listaMedicamentosAlergia = new ArrayList<>();

	public Paciente( Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Medicamento setMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isAlergico() {
		if(listaMedicamentosAlergia == null) {
			alergico = false;
		}else {
			alergico = true;
		}
		return alergico;
	}


	public boolean seAconseja() {
		boolean aconseja = false;
		if (sintomasEnComun() && !isAlergico()) {
			aconseja = true;
		} else if (sintomasEnComun() && !listaMedicamentosAlergia.contains(medicamento)) {
			aconseja = true;
		} else {
			aconseja = false;
		}
		return aconseja;
	}

	public boolean sintomasEnComun() {
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

	

}
