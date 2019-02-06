# EJEMPLO DE ESCANER DE PUERTOS SIMPLE EN JAVA

## El programa mostrara por consola el resultado de los diferentes puertos del sistema, avisando de si estan en uso o libre.

``` java

import java.io.IOException;
import java.net.ServerSocket;

public class EscanerDePuertosSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contadorPuertos = 1;
		System.out.println("Comenzamos nuestro escaner de puertos! :");
		
        while(contadorPuertos <= 65535)
        {
        	try
        	{	
	        	for (int i = 1; i <= 65535; i++) 
	        	{
	        		ServerSocket server = new ServerSocket(i);
	        		System.out.println("Puerto: "+i+" ="+server);
	        		contadorPuertos++;
				}
	        }
        	catch(IOException e)
        	{
        		System.out.println("El puerto "+contadorPuertos+" esta abierto!!!!");
        		contadorPuertos++;
        	}
		
        }//fin while
	}
}


```
