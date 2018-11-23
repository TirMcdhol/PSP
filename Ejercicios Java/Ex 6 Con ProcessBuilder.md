# EJERCICIOS CON PROCESSBUILDER EN JAVA

## ProcessBuilder nos sirve para poder lanzar procesos a través de java, con ello podemos abrir aplicacionies predeterminadas documentos de texto, excel o incluso acceder a la consola de windows / linux y ejecutar los comandos que queramos mientras por la consola de Eclipse se nos muestran los resultados.

### Con este programa usamos ProcessBuilder para abrir el Google Chrome

``` java
public class Uno {

	public static void main (String[] args) {
		
		try {
			ProcessBuilder pb = new ProcessBuilder("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"","");
			pb.start();
			
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}		
	}	
}

```

### Con este programa ejecutamos en el cmd el comando tasklist y hacemos que se muestre el resultado en la consola de Eclipse

``` java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Dos {

	public static void main(String[] args) throws IOException {
		final String commands[] = {"cmd.exe","/C","tasklist"};
		
		Process process = new ProcessBuilder(commands).start(); //se crea el procedimiento
		
		//Se lee la salida
		InputStream is = (InputStream) process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);			
		}

		//Esperamos a que el proceso termine
		try {
			int exitValue = process.waitFor();
			System.out.println("\nCodigo de salida: "+exitValue);
		}catch(InterruptedException e) {
			e.printStackTrace(System.err);
		}		
	}
}

```

### Con este programa lanzamos un proceso que abrira nuestro lector de pdf escogido

``` java
public class Tres {

	public static void main(String[] args) {

		try {
			Process p = Runtime.getRuntime().exec(  "\"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe\"");  
				    p.waitFor();  
		}catch(Exception e) {
			System.out.println("Exception: "+e);
		}
	}
}
```

### Con este programa haciendo uso del runtime, lanzamos un proceso que nos habra una hoja de calculo que le digamos

``` java
import java.io.IOException;

public class Cuatro {

	public static void main(String[] args) {
		
		try{ 
			/* Pasamos la ruta por un array para ahorrarnos las exclusiones de caracteres el ejemplo sisguiente es
			como si usaramos: Runtime.getRuntime().exec("\"D:\\prog file\\090422.xls\""); */
			String[] cmdarray=new String[]{"cmd.exe","/c","C:\\Users\\DAM 2\\Downloads\\Hoja de Calculo de prueba.ods"}; 
			Runtime.getRuntime().exec(cmdarray); 
			// otro modo Runtime.getRuntime().exec("cmd /c start \"\" \"D:\\prog file\\090422.xls\""); 

			}catch(IOException e){ 
			e.printStackTrace(); 
			} 
	}		
}
```

### En este programa ejecutamos la cmd para que muestre la version actual del JDK instalado en el ordenador y que el resultado se muestre en la consola de Eclipse usando un BufferReader

``` java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cinco {
		
		public static void main(String[] args) throws IOException {
		
		        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "java -version");
		        builder.redirectErrorStream(true);
		        Process p = builder.start();
		        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		        String line;
		        while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }
		    }
}

```
