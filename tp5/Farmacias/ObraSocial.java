
public class ObraSocial {
	private double precio;
	private String obraSocial;
	
	public double getPrecio(Medicamento medicamento) {
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

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
