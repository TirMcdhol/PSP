# EJEMPLO DE ESCANER DE PUERTOS SIMPLE EN JAVA

## El programa mostrara por consola el resultado de los diferentes puertos del sistema, avisando de si estan en uso o libre.

``` java

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
	        		if(contadorPuertos == 65535)
	        			server.close();
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
