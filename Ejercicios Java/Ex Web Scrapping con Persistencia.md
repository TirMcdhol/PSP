
java '''

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * Fecha: 07-02-2019
 * Origen: TirMcdhol
 * Objetivo: Este pequeño programa guardara en un archivo txt los manuales de rol encontrados
 * en la página web http://grimorio.sociedadnocturna.net/ en su seccion de descargas.
 * Para ello nos mostrara el titulo del manual así como su link de descarga href, y guardara
 * el documento en nuestor escritorio. Cuenta con un filtro de busqueda que hace que
 * aquellos resultados que coincidan con nuestra busqueda se muestren rojos en consola.
*/

public class WebScrappingLinksManualesRolConPersistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			/*Creamos el archivo donde almacenamos la información
			 *que extraemos con el Web Scrapping, y el FileWriter para
			 *escribir en el.
			*/
			
			File archivo = new File("C:\\Users\\DAM 2\\Desktop\\Manuales.txt");
			archivo.createNewFile();
			/*Siempre se machacara el archivo destino con los nuevos resultados*
			 * si se quiere ir añadiendo sin borrar cambiar la segunda
			 * variable de entrada de false a true en el FileWriter.
			 */
			FileWriter filewriter = new FileWriter(archivo,false);
			PrintWriter printwriter = new PrintWriter(filewriter); 
			
			// Asignamos el documento sobre una HTTP
			Document doc = Jsoup.connect("http://grimorio.sociedadnocturna.net/Listado.php").get();
			
			// Extraemos el url de la pagina de busqueda y la guardamos en el .txt.
			String url = doc.baseUri();
			System.out.println("URL de la Pagina: "+url);
			printwriter.println("URL de la Pagina: "+url);
			
			//conseguimos todos los link de descarga de la pagina
			Elements links = doc.select("a[href]");
			for (Element link :links)
			{
				/*Incluimos una clausula de busqueda con if para que nos resalte los manuales
				 * con los parametros de busqueda que queremos y nos los imprima en 
				 * rojo
				*/
				if (link.text().toString().contains("eaten") || link.text().toString().contains("Cthulhu") || link.text().toString().contains("Primigenios"))
				{
					//extraemos de uno en uno el valor del atributo href
					System.err.println("Texto: "+link.text());
					System.err.println("Link: "+link.attr("href"));
					printwriter.println("Texto: "+link.text());
					printwriter.println("Link href: "+link.attr("href"));
				}
				else
				{
					//extraemos de uno en uno el valor del atributo href
					System.out.println("Texto: "+link.text());
					System.out.println("Link: "+link.attr("href"));
					printwriter.println("Texto: "+link.text());
					printwriter.println("Link href: "+link.attr("href"));
				}
			}
		} catch (FileNotFoundException e1) {
			// TODO: handle exception
			System.err.println("Error al encontrar el archivo txt:\n");e1.printStackTrace();
		} catch (IOException e2) {
			// TODO: handle exception
			System.err.println("Error en la extracción de datos:\n");e2.printStackTrace();
		} 
	}

}

'''
