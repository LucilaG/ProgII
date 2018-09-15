package tp5.eje1;
import java.util.ArrayList;

public class Paciente {
	private Medicamento medicamento;
	private double precio;
	private boolean alergico;
	private String obraSocial;
	ArrayList<String> sintomas = new ArrayList<>();
	ArrayList<Medicamento> listaMedicamentosAlergia = new ArrayList<>();

	public Paciente( Medicamento medicamento, String obraSocial) {
		this.medicamento = medicamento;
		this.setObraSocial(obraSocial);
	}

	public Medicamento setMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public double getPrecio() {
		obraSocial.toLowerCase();
		if(this.obraSocial == "prepaga") {
			this.precio = medicamento.getPrecio()*0.4 ;
		}else if(this.obraSocial == "sindical") {
			this.precio = medicamento.getPrecio()*0.5 ;
		}else {
			this.precio = medicamento.getPrecio() ;
		}
		return precio;
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

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	

}

