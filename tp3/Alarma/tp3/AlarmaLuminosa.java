package tp3;

public class AlarmaLuminosa extends Alarma implements Luz{

	public AlarmaLuminosa(boolean vidrioRoto, boolean ventanaAbierta, boolean movimiento) {
		super(vidrioRoto, ventanaAbierta, movimiento);
	}
	
	public void comprobar() {
		if (isVidrioRoto() || isVentanaAbierta() || isMovimiento()) {
			encender();
			hacerSonar();
		}
	}
	
	@Override
	public void encender() {
		System.out.println("Se encendio la luz");
	}
	
}
