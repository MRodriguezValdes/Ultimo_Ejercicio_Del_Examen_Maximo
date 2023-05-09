
public class BarcoPortaAviones implements Barco {

	private int cantidadDeAviones;
	private int cantidadDeMarinos;

	public BarcoPortaAviones() {
		super();
	}

	public BarcoPortaAviones(int cantidadDeAviones, int cantidadDeMarinos) {
		this.setCantidadDeAviones(cantidadDeAviones);
		this.setCantidadDeMarinos(cantidadDeMarinos);
		System.out.println("Cantidad de aviones: " + this.getCantidadDeAviones() + " Cantidad de marinos :"
				+ this.getCantidadDeMarinos());
	}

	public int getCantidadDeAviones() {
		return cantidadDeAviones;
	}

	public void setCantidadDeAviones(int cantidadDeAviones) {
		this.cantidadDeAviones = cantidadDeAviones;
	}

	public int getCantidadDeMarinos() {
		return cantidadDeMarinos;
	}

	public void setCantidadDeMarinos(int cantidadDeMarinos) {
		this.cantidadDeMarinos = cantidadDeMarinos;
	}

	@Override
	public void alarma() {
		System.out.println("Soy un portaaviones");

	}

	@Override
	public void mensajeSocorro(String mensaje) {
		alarma();
		System.out.println(mensaje);

	}

}
