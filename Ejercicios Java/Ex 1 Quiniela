# Quiniela
Este es el código realizado en Java

``` java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejer1Quiniela {

	/*public static int Cuenta(String cadena, char caracter) {
		int posicion, contador = 0;
		 posicion = cadena.indexOf(caracter);
	        while (posicion != -1) { //mientras se encuentre el caracter
	            contador++;           //se cuenta
	            //se sigue buscando a partir de la posición siguiente a la encontrada
	            posicion = cadena.indexOf(caracter, posicion + 1);
	        }
		return contador;
	}*/
	
	public static int Cuenta(String cadena, char caracter) {
		int contador = 0;
		
		 for (int j = 0; j < cadena.length(); j++){
		   char character = cadena.charAt(j);
		   if (character == 'x' || character == 'X') 
		  contador++;
		 }
		return contador;
	}
		public static void main (String[] args) {
			
			int combinacion = 1;
			char[] result = new char [14];
			String cadena;
			
			for (int i1 = 0; i1 < 3; i1++) {
				for (int i2 = 0; i2 < 3; i2++) {
					for (int i3 = 0; i3 < 3; i3++) {
						for (int i4 = 0; i4 < 3; i4++) {
							for (int i5 = 0; i5 < 3; i5++) {
								for (int i6 = 0; i6 < 3; i6++) {
									for (int i7 = 0; i7 < 3; i7++) {
										for (int i8 = 0; i8 < 3; i8++) {
											for (int i9 = 0; i9 < 3; i9++) {
												for (int i10 = 0; i10 < 3; i10++) {
													for (int i11 = 0; i11 < 3; i11++) {
														for (int i12 = 0; i12 < 3; i12++) {
															for (int i13 = 0; i13 < 3; i13++) {
																for (int i14 = 0; i14 < 3; i14++) {
																	
																	//Pasamos a string y los introducimos en un array los resultados de los i de los diferentes for, para poder poner como X los resultados que sean 1, como 1 los 0 y como 2 los 2.
																	result[0] = i1 ==  0 ? '1' : '2'; result[0] = i1 ==  1 ? 'X' : result[0];
																	result[1] = i2 ==  0 ? '1' : '2'; result[1] = i2 ==  1 ? 'X' : result[1];
																	result[2] = i3 ==  0 ? '1' : '2'; result[2] = i3 ==  1 ? 'X' : result[2];
																	result[3] = i4 ==  0 ? '1' : '2'; result[3] = i4 ==  1 ? 'X' : result[3];
																	result[4] = i5 ==  0 ? '1' : '2'; result[4] = i5 ==  1 ? 'X' : result[4];
																	result[5] = i6 ==  0 ? '1' : '2'; result[5] = i6 ==  1 ? 'X' : result[5];
																	result[6] = i7 ==  0 ? '1' : '2'; result[6] = i7 ==  1 ? 'X' : result[6];
																	result[7] = i8 ==  0 ? '1' : '2'; result[7] = i8 ==  1 ? 'X' : result[7];
																	result[8] = i9 ==  0 ? '1' : '2'; result[8] = i9 ==  1 ? 'X' : result[8];
																	result[9] = i10 ==  0 ? '1' : '2'; result[9] = i10 ==  1 ? 'X' : result[9];
																	result[10] = i11 ==  0 ? '1' : '2'; result[10] = i11 ==  1 ? 'X' : result[10];
																	result[11] = i12 ==  0 ? '1' : '2'; result[11] = i12 ==  1 ? 'X' : result[11];
																	result[12] = i13 ==  0 ? '1' : '2'; result[12] = i13 ==  1 ? 'X' : result[12];
																	result[13] = i14 ==  0 ? '1' : '2'; result[13] = i14 ==  1 ? 'X' : result[13];
																	
																	cadena = result.toString();
																	
																//if(Cuenta(cadena,'1') > 10 || Cuenta(cadena,'1') <= 5 || Cuenta(cadena,'X') < 2 || Cuenta(cadena,'X') > 6 || Cuenta(cadena,'2') < 3 || Cuenta(cadena,'2') > 9 ) {
																	if(Cuenta(cadena,'2') > 10) 
																		System.out.println("No funciona");
																	else{
																	System.out.print(result[0]+" "+result[1]+" "+result[2]+" "+result[3]+" "+result[4]+" "+result[5]+" "+result[6]+" "+result[7]+" "+result[8]+" "+result[9]+" "+result[10]+" "+result[11]+" "+result[12]+" "+result[13]+" Combinación"
																			+ ":"+combinacion+"\n");
																	combinacion++; // Contador que cuenta la secuencia de combinaciones validas
																	}//fin del else
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
}
```
