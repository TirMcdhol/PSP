### CODIGO JAVA PARA LEER UN ARCHIVO CSV EN UNA URL Y ALMACENAR LA INFORMACION EN UN ARCHIVO DE TEXTO

```
import java.net.*;
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
