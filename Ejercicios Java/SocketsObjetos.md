## Ejercicios con Sockets, que permite al usuario mediante telnet, solicitarle al servidor un registro de datos sobre los objetos almacenados en el proyecto, en nuestro case los libros y secciones de una biblioteca, a través del CMD.

``` java

//CLASES DE OBJETOS (LIBRO - SECCION)

public class Libro {

	int codigoLibro;
	String nombre;
	String autor;
	int ano;
	
	public Libro (int cod,String nom, String autor, int ano) {
		this.codigoLibro = cod;
		this.nombre = nom;
		this.autor = autor;
		this.ano = ano;
	}

	public int getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(int codigo_libro) {
		this.codigoLibro = codigo_libro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return ("Libro: " + codigoLibro + "\tNombre: " + nombre + "\tAutor: " + autor + "\tYear: " + ano);
	}
	
}

public class Secciones {

	int codigoSeccion;
	String nombreSeccion;
	int numeroLibros;
	String localizacion;
	
	public Secciones(int codigoSeccion, String nombreSeccion, int numeroLibros, String localizacion) {
		super();
		this.codigoSeccion = codigoSeccion;
		this.nombreSeccion = nombreSeccion;
		this.numeroLibros = numeroLibros;
		this.localizacion = localizacion;
	}

	public int getCodigoSeccion() {
		return codigoSeccion;
	}

	public void setCodigoSeccion(int codigoSeccion) {
		this.codigoSeccion = codigoSeccion;
	}

	public String getNombreSeccion() {
		return nombreSeccion;
	}

	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}

	public int getNumeroLibros() {
		return numeroLibros;
	}

	public void setNumeroLibros(int numeroLibros) {
		this.numeroLibros = numeroLibros;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
	@Override
	public String toString() {
		return ("Seccion: " + codigoSeccion + "\tNombre: " + nombreSeccion + "\tNumero Libros: " + numeroLibros + "\tLocalizacion: " + localizacion);
	}
}

//MAIN SOCKET SERVIDOR

public class MultiThreadServer {

	public static ArrayList<Libro> listaLibros = new ArrayList<Libro>();
	public static ArrayList<Secciones> listaSecciones = new ArrayList<Secciones>();
	
	public static void IntroducirDatosClases() {
		
		listaLibros.add(new Libro(1,"Necronomicon","Nabucodonosor",1976));
		listaLibros.add(new Libro(2,"Ritos Satanicos","Luisa Torroja",2002));
		listaLibros.add(new Libro(3,"Yo fantasma","Sang Ediciones",2018));
		listaLibros.add(new Libro(4,"La mente rota","Laura Lago",1988));
		
		listaSecciones.add(new Secciones(1,"Brujeria",201,"Ala Este"));
		listaSecciones.add(new Secciones(2,"Demonologia",117,"Ala Sur"));
		listaSecciones.add(new Secciones(3,"Psicologia",250,"Ala Norte"));
		listaSecciones.add(new Secciones(4,"Parapsicologia",89,"Ala Oeste"));
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			
		IntroducirDatosClases();
		
		ServerSocket serverSocket = new ServerSocket(9090);
		
		boolean stop = false;
		while(!stop)  
			{
				System.out.println("Library a la espera de clientes...");
				Socket clientSocket = serverSocket.accept();
				//usamos la clase ClientThread
				ClientThread clientThread = new ClientThread(clientSocket);
				clientThread.start();
			}		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERROR\n"); e.printStackTrace();
		}
		
	}

}

//CLASE SOCKET CLIENTE MULTIHILO HEREDA DE THREAD

public class ClientThread extends Thread{

	private Socket socket = null;
	
	public ClientThread(Socket socket) 
	{
		this.socket = socket;
	}
	
	public void run()
	{
		try {
			//2.- OUT -> cliente
			//Necesitamos un stream para enviar datos al cliente
			//vamos a enviar un mensaje al cliente con PrintWriter
			PrintWriter out = null;
			out = new PrintWriter(socket.getOutputStream(),true);
			out.println("Ospring Library Bookshelter abre sus puertas....");
			out.println("================================================");
			out.println("OPCION 1: MOSTRAR LIBROS");
			out.println("OPCION 2: MOSTRAR SECCIONES DE LA BIBLIOTECA");
			out.println("================================================");

			//3.- IN <- cliente
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String clienteInput = input.readLine();
			
			switch(clienteInput) {
			case "1": 
				out.println("OPCION: "+clienteInput);
				out.println("================================================");
				for (Libro libro : MultiThreadServer.listaLibros) {
					out.println(libro);
				}
				break;
			case "2": 
				out.println("OPCION: "+clienteInput);
				out.println("================================================");
				for (Secciones secciones : MultiThreadServer.listaSecciones) {
					out.println(secciones);
				}
				break;
			default: out.println("LA OPCION INTRODUCIDA NO ES VALIDA");
			}
			
			//4.-Cerrar stream + socket
			input.close();
			out.close();
			socket.close();			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

```
