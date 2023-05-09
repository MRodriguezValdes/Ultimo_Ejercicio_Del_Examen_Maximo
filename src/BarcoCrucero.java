
public class BarcoCrucero implements Barco {

	private float metrosDeEsclora;
	private int capacidad;
	private static int countCamasOcupadas = 0;

	public BarcoCrucero() {
		this.metrosDeEsclora = 0;
	}

	public BarcoCrucero(float metrosDeEsclora, int capacidad) {
		this.setCapacidad(capacidad);
		this.setMetrosDeEsclora(metrosDeEsclora);
		System.out.println(
				"Capacidad del crucero: " + this.getCapacidad() + "Metros de esclora: " + this.getMetrosDeEsclora());
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public float getMetrosDeEsclora() {
		return metrosDeEsclora;
	}

	public void setMetrosDeEsclora(float metrosDeEsclora) {
		this.metrosDeEsclora = metrosDeEsclora;
	}

	public static int getCountCamasOcupadas() {
		return countCamasOcupadas;
	}

	public static void setCountCamasOcupadas(int countCamasOcupadas) {
		BarcoCrucero.countCamasOcupadas = countCamasOcupadas;
	}

//	Metodos:

	public void registrarTripulantes(int cantidad) {
		countCamasOcupadas += cantidad;
	}

	@Override
	public void alarma() {
		// TODO Auto-generated method stub

		System.out.println("Soy un crucero");
	}

	@Override
	public void mensajeSocorro(String mensaje) {
		alarma();
		System.out.println(mensaje);

	}
}
