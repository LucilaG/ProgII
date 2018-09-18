import java.util.ArrayList;

public class Farmacia {
	ArrayList<Medicamento> db_medicamentos = new ArrayList<>();
	ArrayList<Paciente> db_pacientes = new ArrayList<>();

	public double precioConObraSocial(Paciente paciente, Medicamento medicamento) {
		return (paciente.getObraSocial() == null) ? medicamento.getPrecio()
				: paciente.getObraSocial().getDescuento() * medicamento.getPrecio();
	}
}
