package a0_Threads_JARROBA;

/**
 *
 * @author Richard
 */
public class Cliente {

	private String nombre;
	private int[] carroCompra;

	public Cliente(String nombre, int[] carroCompra) {
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}

	public String getNombre() {
		return nombre;
	}

	public int[] getCarroCompra() {
		return carroCompra;
	}

}
