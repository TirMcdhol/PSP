### CODIGO PARA LEER LA INFORMACION DE UN CSV Y GUARDARLA EN UN ARRAY, EN ESTE CASO CONCRETO GUARDANDO UNA LISTA DE AEROPUERTOS.

``` import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("https://raw.githubusercontent.com/jpatokal/openflights/master/data/airports.dat");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        BufferedWriter out = new BufferedWriter(new FileWriter("listaAeropuertos.dat"));
        
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            out.write(inputLine+"\n");
        in.close();
        out.close();
    }
}

```
