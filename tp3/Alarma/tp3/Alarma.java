package tp3;

public class Alarma implements Timbre {
	public boolean vidrioRoto, ventanaAbierta, movimiento;

	public Alarma(boolean vidrioRoto, boolean ventanaAbierta, boolean movimiento) {
		this.vidrioRoto = vidrioRoto;
		this.ventanaAbierta = ventanaAbierta;
		this.movimiento = movimiento;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVentanaAbierta(boolean ventanaAbierta) {
		this.ventanaAbierta = ventanaAbierta;
	}

	public boolean isVentanaAbierta() {
		return ventanaAbierta;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	@Override
	public void hacerSonar() {
		System.out.println("La alarma esta sonando");
	}

	public void comprobar() {
		if (isVidrioRoto() || isVentanaAbierta() || isMovimiento()) {
			hacerSonar();
		}
	}

}
