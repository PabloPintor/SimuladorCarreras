import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

	private Modelo modelo;
	private VentanaPpal vista;
	
	public static void main(String[] args) {
		
		new Principal();

	}
	
	public Principal() {
		
		this.modelo = new Modelo();
		this.vista = new VentanaPpal(this);
		this.vista.mostrarVentana();
		
	}

	public String getListadoCarreras() {
		
		return this.modelo.getListadoCarreras();
	}
	
	public void crearCarrera(Float corredor1, float corredor2) {
		
		this.modelo.crearCarrera(corredor1, corredor2);
		
	}

	public void guardarFichero() {
		
		this.modelo.guardarFichero();
		
	}

	public void cargarFichero() {
		
		this.modelo.cargarFichero();
		
	}

	public TreeMap<Integer, LinkedList<Float>> getRegistro() {
		
		return this.modelo.getRegistro();
	}

	public int getCarreraActual() {
		
		return this.modelo.getCarreraActual();
	}

}
