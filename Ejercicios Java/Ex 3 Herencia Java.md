# HERENCIA EN JAVA

## Este ejercicio nos muestra como funciona la herencia en Java, mostrandonos varias clases que heredan de otras.

```j

public class MainHerencia_EX3 {

	public static void main(String[] args) {
		
		Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
		
	}

}// FIN DEL MAIN


public class Empleado {
		
	//Atributos
	
		private String nombre = "";
		
	//Constructores
		
		public Empleado (String nom) {
			this.nombre = nom;
		}
		
	//Setter y Getters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	//Otros Metodos
		
		@Override
		public String toString() {
			return "Empleado "+this.nombre;
		}	
    
}// FIN CLASE EMPLEADO (CLASE PADRE)


public class Operario extends Empleado{
	
	//Constructores
	
	public Operario(String nom) {
		super(nom);		
	}
	
	//Otros Metodos
	
	@Override
	public String toString() {
		return super.toString()+" -> Operario";
	}

}// FIN CLASE OPERARIO (HEREDA DE EMPLEADO)


public class Directivo extends Empleado {

	//Constructores
	
	public Directivo(String nom) {
		super(nom);		
	}
	
	//Otros Metodos
	
	@Override
	public String toString() {
		return super.toString()+" -> Directivo";
	}

}// FIN CLASE DIRECTIVO (HEREDA DE EMPLEADO)


public class Oficial extends Operario {

	//Constructores
		
	public Oficial(String nom) {
		super(nom);
	}
	
	//Otros Metodos
	
	@Override
	public String toString() {
		return super.toString()+" -> Oficial";
	}

}// FIN CLASE OFICIAL (HEREDA DE OPERARIO)


public class Tecnico extends Operario {

	//Constructores
		
	public Tecnico(String nom) {
		super(nom);
	}
	
	//Otros Metodos
	
	@Override
	public String toString() {
		return super.toString()+" -> Tecnico";
	}

}// FIN CLASE TECNICO (HEREDA DE OPERARIO)

```
