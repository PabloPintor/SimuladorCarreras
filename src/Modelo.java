import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.TreeMap;

public class Modelo {

	private TreeMap<Integer, LinkedList<Float>> registro;
	private int carreraActual=0;

	public Modelo() {

		this.registro = new TreeMap<Integer, LinkedList<Float>>();

	}

	public void crearCarrera(float corredor1, float corredor2) {

		this.carreraActual++;

		this.registro.put(carreraActual, new LinkedList());
		this.registro.get(carreraActual).add(corredor1);
		this.registro.get(carreraActual).add(corredor2);

	}


	String getListadoCarreras() {

		String listado="";
		String velocidad1="";
		String velocidad2="";

		for (int identificador  : this.registro.keySet()) {

			velocidad1="";
			velocidad2="";

			velocidad1 += this.registro.get(identificador).getFirst();
			velocidad2 += this.registro.get(identificador).getLast();

			listado+="=====================================================================\n";

			listado+= "Carrera Nº "+identificador+":\n";
			listado+= "Velocidad del corredor 1 ------> "+velocidad1+"\n";
			listado+= "Velocidad del corredor 2 ------> "+velocidad2+"\n";

			if (this.registro.get(identificador).getFirst() > this.registro.get(identificador).getLast()) {

				listado+= "Ganador de la carrera: CORREDOR 1!\n";

			}
			else if (this.registro.get(identificador).getFirst() < this.registro.get(identificador).getLast()) {

				listado+= "Ganador de la carrera: CORREDOR 2!\n";

			}
			else {

				listado+= "Hay un empate!\n";

			}

			listado+="=====================================================================\n";
			listado+="\n";

		}

		return listado;
	}

	public void guardarFichero() {

		File fichero = new File("carreras.dat");

		try {
			FileOutputStream stream = new FileOutputStream(fichero);
			ObjectOutputStream escritor = new ObjectOutputStream(stream);

			escritor.writeObject(this.registro);
			escritor.writeObject(this.carreraActual);

			escritor.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void cargarFichero() {

		File fichero = new File("carreras.dat");

		try {
			FileInputStream stream = new FileInputStream(fichero);
			ObjectInputStream lector = new ObjectInputStream(stream);

			this.registro = (TreeMap<Integer, LinkedList<Float>>) lector.readObject();
			this.carreraActual = (int) lector.readObject();

			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public TreeMap<Integer, LinkedList<Float>> getRegistro() {
		return registro;
	}

	public void setRegistro(TreeMap<Integer, LinkedList<Float>> registro) {
		this.registro = registro;
	}

	public int getCarreraActual() {
		return carreraActual;
	}

	public void setCarreraActual(int carreraActual) {
		this.carreraActual = carreraActual;
	}
	
	

}
