public class BarcoPesquero implements Barco {
	private float metrosDeEsclora;
	private float potencia;
	private int cantidadDePescadores;

	public BarcoPesquero() {

	}

	public BarcoPesquero(float metrosDeEsclora, float potencia, int cantidadDePescadores) {
		this.setMetrosDeEsclora(metrosDeEsclora);
		;
		this.setPotencia(potencia);
		;
		this.setCantidadDePescadores(cantidadDePescadores);
		;
		System.out.println(
				"El barco pesquero tiene: " + this.getMetrosDeEsclora() + " metros de esclora , con una potecia de "
						+ this.getPotencia() + ".Total de pescadores:" + this.getCantidadDePescadores());
	}

	public float getMetrosDeEsclora() {
		return metrosDeEsclora;
	}

	public void setMetrosDeEsclora(float metrosDeEsclora) {
		this.metrosDeEsclora = metrosDeEsclora;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public int getCantidadDePescadores() {
		return cantidadDePescadores;
	}

	public void setCantidadDePescadores(int cantidadDePescadores) {
		this.cantidadDePescadores = cantidadDePescadores;
	}

	@Override
	public void alarma() {
		System.out.println("Soy un barco pesquero");

	}

	@Override
	public void mensajeSocorro(String mensaje) {
		alarma();
		System.out.println(mensaje);

	}

}
