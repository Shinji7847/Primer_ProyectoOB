package proyecto1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class DatosAvanzados {

	public static void main(String[] args) throws IOException {
		
		String texto = "Hola mundo";
		
		System.out.println("Impresión del texto al reves: ");
		reverse(texto);
		
		System.out.println("\n**************");
		
		String[] miArray = new String[5];
		miArray[0] = "Juan";
		miArray[1] = "Pablo";
		miArray[2] = "Carlos";
		miArray[3] = "Alejandro";
		miArray[4] = "Facundo";
		
		System.out.println("Mi array contiene a: ");
		
		for(String i : miArray) {
			System.out.println(i);
		}
		
		System.out.println("**************");
		
		int[][] arrayBidi = {{10, 15, 20, 30, 35},
							{30,60,90,120,150}
		};
		
		for(int i =0; i< arrayBidi.length; i++){ 
			System.out.println("Valor de i = " + i);

				for(int j= 0; j< arrayBidi[1].length; j++){
				System.out.println("Estoy en i = " + i + ", donde j = " + j);
				System.out.println("El elemento aqui es " + arrayBidi[i][j]);
				}
			}
		
		System.out.println("**************");
		
		Vector<String> vector1 = new Vector<String>();
		
		vector1.add("Jefe");
		vector1.add("Secretario");
		vector1.add("Asesor");
		vector1.add("Director");
		vector1.add("Ejecutivo");
		
		vector1.remove(1);
		vector1.remove(2);
		
		System.out.println("La capacidad del vector es " + vector1.capacity());
		System.out.println("Resultado final del vector:");

		for(int i=0; i < vector1.size(); i++){
			System.out.println("Valor es: "+ vector1.get(i) + " en posición: " + i);
			}
		
		System.out.println("**************");
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Leche");
		lista.add("Huevos");
		lista.add("Harina");
		lista.add("Aceite");
		
		for(String ingredientes: lista){
			System.out.println("La lista cuenta con: " + ingredientes);
			}
		
		LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
		
		for(String ingredientes: listaEnlazada){
			System.out.println("La lista enlazada cuenta con: " + ingredientes);
			}
		
		System.out.println("**************");
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		for(int i = 1; i < 11; i++) {
			listaNumeros.add(i);
		}
		
		System.out.println("La capacidad del ArrayList es " + listaNumeros.size());
		
		for(int i = 0; i < listaNumeros.size(); i++) {
			System.out.println("Elemento " + listaNumeros.get(i) + " en posición " + i);
		}
		
		listaNumeros.removeIf(n -> (n%2 == 0)); //remueve los pares
		System.out.println("Eliminando los elementos pares...");
		
		for(int i = 0; i < listaNumeros.size(); i++) {
			System.out.println("Elemento " + listaNumeros.get(i));
		}
		
		System.out.println("**************");
		System.out.println("Resultado de función dividePorCero:");
		
		try {
		dividePorCero(50, 0);
			}catch(Exception e) {
				System.out.println("Esto no puede hacerse");
			}finally {
				System.out.println("Demo de código");
			}
		
		
		try {
			InputStream fileIn = new FileInputStream("C:\\Users\\usuario\\Desktop\\OpenBootcamp Full Stack\\Ejercicios variados.txt");
			byte[] datos = fileIn.readAllBytes();
			fileIn.close();
			
			PrintStream fileOut = new PrintStream("C:\\Users\\usuario\\Desktop\\Copia destino.txt");
			fileOut.write(datos);
			fileOut.close();
			
		}catch(Exception e) {
			System.out.println("El programa no está funcionando. " + e.getMessage());
		}
			
			
	
	}

	/* Comentario:
	 * El inconveniente con los vectores está en el costo de copiado de un array a otro
	 * al incrementar la capacidad al doble(por defecto)
	 * El el caso de tener 1000 elementos y utilizar la capacidad por defecto (de 10), 
	 * esto tendría un elevado costo a nivel de computo, 
	 * pues se copiaría una y otra vez hasta llegar a esta cantidad,
	 * posiblemente saturando la maquina.
	 */
	
	public static String reverse(String texto) {
		
		for(int i = texto.length() - 1; i >= 0; i--) {
			
			System.out.print(texto.charAt(i));
			
		}
		return texto;
	
	}
	
	public static int dividePorCero(int a, int b) throws ArithmeticException {
		
		int resultado = 0;
		try {
			resultado = a / b;
		}catch(ArithmeticException e) {
			throw new ArithmeticException();
		}
		
		return resultado; 
	}
	

}
