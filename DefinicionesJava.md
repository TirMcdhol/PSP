# DEFINICIONES DE ELEMENTOS JAVA

## - CLASE

### ¿Qué es una clase?
Las clases en Java son básicamente una plantilla que sirve para crear un objeto. Si imaginásemos las clases en el mundo en el que vivimos, podríamos decir que la clase “persona” es una plantilla sobre cómo debe ser un ser humano. Todos y cada uno de nosotros, los seres humanos, somos objetos de la clase “persona“, ya que todos somos personas. La clase “persona” contiene la definición de un ser humano, mientras que cada ser humano es una instancia u objeto de dicha clase.
Las clases contienen atributos que definen las propiedades del elemento que intentan representar. Ejemplo:

```java
public class Persona {
  
  private String dni = "92921933X"
  private String nombre = "Pepe"
  private String apellidos = "Castro Garcia"
  private double altura = "1.85"
  private double peso = "85.3"
  private String colorPiel = "Negro"
  
}

```

## - ENCAPSULACION

### ¿Qué es el encapsulamiento?
En programación modular, y más específicamente en programación orientada a objetos, se denomina encapsulamiento al ocultamiento del estado, es decir, de los datos miembro de un objeto de manera que solo se pueda cambiar mediante las operaciones definidas para ese objeto.
Cada objeto está aislado del exterior, es un módulo natural, y la aplicación entera se reduce a un agregado o rompecabezas de objetos. El aislamiento protege a los datos asociados de un objeto contra su modificación por quien no tenga derecho a acceder a ellos, eliminando efectos secundarios e interacciones.
De esta forma el usuario de la clase puede obviar la implementación de los métodos y propiedades para concentrarse solo en cómo usarlos. Por otro lado se evita que el usuario pueda cambiar su estado de maneras imprevistas e incontroladas.

En resumen podemos decir que el encapsulamiento es la manera en que los datos de la aplicación quedan aislados y solo se puede acceder a ellos usando pautas concretas, que son los metodos que se han creado concretamente para ello, de esta manera nos evitamos modificaciones involuntarias evitando así problemas una vez se este usando la aplicación. Ejemplo:

```java
public class Persona {
  
  private String dni = "92921933X"
  private String nombre = "Pepe"
  private String apellidos = "Castro Garcia"
  private double altura = "1.85"
  private double peso = "85.3"
  private String colorPiel = "Negro"
  
  
  // EJEMPLO DE ENCAPSULACION QUE OBLIGA A USAR ESTOS METODOS SI SE QUIEREN CAMBIAR LOS PARAMETROS DE ESTA PERSONA
  // ***EN CONCRETO METODOS PARA LEER SU NOMBRE, O MODIFICARLO
  
  public String getNombre(){
    return this.nombre;
  }
  
  public void setNombre(String nuevoNombre){
    this.nombre = nuevoNombre
  }
}

```

## - DECLARACION E INICIALIZACION DE VARIABLES

### ¿Qué es declarar una variable?
Para tener una variable en un programa, previamente hay que definirla con un tipo y un identificador (es decir, un nombre para la variable).Y seguidamente hay que añadir un punto y coma a la expresión.
El punto y coma transforma la expresión en una instrucción que se ejecutará en el programa. Cuando se llegue a ella, el programa reservará espacio de memoria según el tipo de variable para poder escribir y leer valores. Por lo tanto, la fórmula general es:
### <tipo> <identificador> <;>
Es lo que llamamos una declaración de variable. Todas las variables se deben declarar antes de su uso. Si no, se producirá un error de compilación. Ejemplo:

```java

//Declaramos 2 variables, una de tipo texto donde se guardara el nombre, y otra de tipo entero donde se guardara la edad

String nombre;
int edad;

```


## - SOBRECARGA DE METODOS

## - HERENCIA

## - POLIFORMISMO

## - INTERFACES
