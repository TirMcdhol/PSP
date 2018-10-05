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
### tipo identificador ;
Es lo que llamamos una declaración de variable. Todas las variables se deben declarar antes de su uso. Si no, se producirá un error de compilación. Ejemplo:

```java

//Declaramos 2 variables, una de tipo texto donde se guardara el nombre
//y otra de tipo entero donde se guardara la edad

String nombre;
int edad;

```

### ¿Qué es inicializar una variable?
Una variable que ha sido solo declarada no posee contenido, y por tanto su valor será NULL(nulo) por defecto o en caso de variables
numéricas suelen tener valores por defecto como -1. Para poder trabajar con una variable en un programa, llegara el momento en que
deberemos inicializarla dandole un valor, el cual no tiene porque ser el mismo a lo largo del funcionamiento de un programa sino que
puede ir variando.

```java

//En este caso incializamos las dos variables declaradas anteriormente y les damos unos valores a cada una
//el nombre será Maria Jose y la edad seran 28 años

String nombre = "Maria Jose";
int edad = 28;

```

## - SOBRECARGA DE METODOS

### ¿Qué es la sobrecarga de un metodo?
Sobrecarga es la capacidad de un lenguaje de programación, que permite nombrar con el mismo identificador diferentes variables u operaciones.
En programación orientada a objetos la sobrecarga se refiere a la posibilidad de tener dos o más funciones con el mismo nombre pero funcionalidad diferente. Es decir, dos o más funciones con el mismo nombre realizan acciones diferentes. El compilador usará una u otra dependiendo de los parámetros usados. A esto se llama también sobrecarga de funciones.
También existe la sobrecarga de operadores que al igual que con la sobrecarga de funciones se le da más de una implementación a un operador. El mismo método dentro de una clase permite hacer cosas distintas en función de los parámetros.
Java no permite al programador implementar sus propios operadores sobrecargados, pero sí utilizar los predefinidos como el +. C++, por el contrario si permite hacerlo. Ejemplo:

```java

public class Persona{

   private String nombre;
   
   public void setNombre() {                      //Este metodo pone por defecto el nombre de Pedro cuando se usa.
        this.nombre = "Pedro";
   }
   public void setNombre(Stringt nuevoNombre) {   //Este metodo nos permite modificar el nombre introduciendo nosotros el nuevo
        this.nombre = nuevoNombre;
   }
}
```

## - HERENCIA

### ¿Qué es la herencia?
La herencia es un mecanismo que permite la definición de una clase a partir de la definición de otra ya existente. La herencia permite compartir automáticamente métodos y datos entre clases, subclases y objetos. 
La herencia está fuertemente ligada a la reutilización del código en la OOP. Esto es, el código de cualquiera de las clases puede ser utilizado sin más que crear una clase derivada de ella, o bien una subclase. 
Hay dos tipos de herencia: Herencia Simple y Herencia Múltiple. La primera indica que se pueden definir nuevas clases solamente a partir de una clase inicial mientras que la segunda indica que se pueden definir nuevas clases a partir de dos o más clases iniciales. Java sólo permite herencia simple. 

Podemos decir que el concepto herencia es que al ya tener unas clases hechas, las nuevas absorven de estas su información y metodos si estan relacionadas. Por ejemplo ya tenemos la clase Persona hecha hasta el momento, si quiesieramos hacer una clase niño, no nos haria falta definirla de nuevo, podemos decir que extiende (extends) de persona, porque los parametros que pueda tener un nño van a ser los mismos que una persona. Ejemplo:

```java

public class Niño extends Persona{

   private String colegio;      //Esta clase Niño tendra estos 2 nuevos atributos (Colegio y curso) ademas de todos aquellos que tiene 
   private String curso;        // la clase Persona (Nombre,Edad,Peso,Altura,........) ya que hereda (extends) de ella.
   
   public void Niño(String colegio, String curso){
      this.colegio = colegio;
      this.curso  = curso;
   }
}
```
## - POLIFORMISMO

### ¿Qué es el poliformismo?
Polimorfismo es la capacidad de un objeto de adquirir varias formas. El uso más común de polimorfismo en programación orientada a objetos se da cuando se utiliza la referencia de una clase padre, para referirse al objeto de la clase hijo.

Cualquier objeto java que pueda pasar más de un test "ES-UN" es considerado polimórfico. En Java, todos los objetos son polimórficos ya que cualquier objeto pasaría un test "ES-UN" dado que son de su propio tipo, además del de la clase Object.

Siguiendo con los ejemplos anteriores dados hasta ahora, podemos decir que Niño es una clase polimorfica debido a que, hereda de la clase Persona, y aunque sea un Niño tambien es una Persona al mismo tiempo. Por lo cual podriamos decir que un niño es una Persona pero no todas las Personas son niños. Lo cual para entenderlo mejor es la posibilidad de crear una nueva clase llamada Adulto que heradara de Persona, tanto Niño como Adulto son Personas.

```java

public class Main {
	public static void main(String[] args) {
		
    Persona[] personas = new Persona[10];        //Dentro de este Array de Personas hay tanto Niños como Adultos
	personas[0] = new Niño;
    	persona[1]  = new Niño;
   	persona[2]  = new Adulto;
	}
```

## - INTERFACES

### ¿Qué es una interfaz?
Interfaz es un término que procede del vocablo inglés interface. En informática, esta noción sirve para señalar a la conexión que se da de manera física y a nivel de utilidad entre dispositivos o sistemas.
La interfaz, por lo tanto, es una conexión entre dos máquinas de cualquier tipo, a las cuales les brinda un soporte para la comunicación a diferentes estratos. Es posible entender la interfaz como un espacio (el lugar donde se desarrolla la interacción y el intercambio), instrumento (a modo de extensión del cuerpo humano, como el mouse que permite interactuar con una computadora) o superficie (el objeto que aporta información a través de su textura, forma o color).
Se conoce como interfaz de usuario al medio que permite a una persona comunicarse con una máquina. La interfaz, en este caso, está compuesta por los puntos de contacto entre un usuario y el equipo. Además del mencionado ejemplo del mouse, otra interfaz de este tipo es la pantalla del monitor o el teclado.

En java, es posible crear una interfaz usando el Swing y sus elementos, los cuales permiten al usuario visualizar e interactuar con el programa a través de esta interfaz visual. Ejemplo:

```java

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase Ventana
 * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
 * Swing, contiene una etiqueta, un caja de texto y un boton, que tiene la
 * accion de mostrar el texto en la caja por una ventana de mensaje.
 * @author Daniel Alvarez (a3dany)
 */
public class Ventana extends JFrame implements ActionListener {

    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Esta Es Una Ventana");                   // colocamos titulo a la ventana
        this.setSize(310, 210);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        boton = new JButton();
        // configuramos los componentes
        texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(caja);
        this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
        JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
```
