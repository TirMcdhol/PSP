### CODIGO PARA LEER LA INFORMACION DE UN CSV Y GUARDARLA EN UN ARRAY, EN ESTE CASO CONCRETO GUARDANDO UNA LISTA DE AEROPUERTOS.

``` 
import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream())); 
        String inputLine;
        String[] datosAeropuerto = new String[13000];
        int posicionGuardado = 0;
        while ((inputLine = in.readLine()) != null) {
        		
					datosAeropuerto[posicionGuardado] = inputLine;
					System.out.println(datosAeropuerto[posicionGuardado]); //según guarda la información en el array nos la muestra
					posicionGuardado++;

            
        	}
        in.close();
    }
}

```
