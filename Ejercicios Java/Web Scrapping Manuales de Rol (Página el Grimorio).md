# EJEMPLO DE WEB SCRAPPING USANDO COMO ORIGEN UNA PAGINA DE MANUALES DE ROL

## El programa mostrara en consola los manuales encontrados con sus enlaces de descarga (Títulos + href).
### Recordar que para hacer uso de Jsoup, tenemos que integra la librería previamente en nuestro proyecto, ya sea a través del 
Build Path, como añadiendo la depencia si trabajamos con Maven.

``` java

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * Fecha: 07-02-2019
 * Origen: TirMcdhol
 * Objetivo: Este pequeño programa mostrara en consola los manuales de rol encontrados
 * en la página web http://grimorio.sociedadnocturna.net/ en su seccion de descargas.
 * Para ello nos mostrara el titulo del manual así como su link de descarga href.
*/

public class WebScrappingLinksManualesRol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Asignamos el documento sobre una HTTP
			Document doc = Jsoup.connect("http://grimorio.sociedadnocturna.net/Listado.php").get();
			
			// Extraemos los titulos de los documentos que hay para descargar en la pagina
			String title = doc.title();
			System.out.println("Título: "+title);
			
			//conseguimos todos los link de descarga de la pagina
			Elements links = doc.select("a[href]");
			for (Element link :links)
			{
				//extraemos de uno en uno el valor del atributo href
				System.out.println("Link: "+link.attr("href"));
				System.out.println("Texto: "+link.text());
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error en la extracción de datos:\n");e.printStackTrace();
		}
	}

}

```
