
public class ObraSocial {
	private double descuento;
	private String obraSocial;
	
	public ObraSocial(double descuento, String obraSocial ) {
		this.descuento = descuento;
		this.obraSocial = obraSocial;
	}
	public double getDescuento() {
		return descuento;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
}
