package tp5.eje1;

public class Farmacia {

	public static void main(String[] args) {
		Medicamento m1 = new Medicamento("amoxi", 20);
		Medicamento m2 = new Medicamento("ibu", 30);
		m1.sintomasATratar.add("mocos");
		m1.sintomasATratar.add("fiebre");
		Paciente p1 = new Paciente(m1);
		
	}

}
