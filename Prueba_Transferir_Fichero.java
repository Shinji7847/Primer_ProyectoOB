package proyecto1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Prueba_Transferir_Fichero {

	public static void main(String[] args) {
		
		try {
			InputStream fileIn = new FileInputStream("C:\\Users\\usuario\\Desktop\\OpenBootcamp Full Stack\\Ejercicios variados.txt");
			
			PrintStream fileOut = new PrintStream("C:\\Users\\usuario\\Desktop\\Copia destino2.txt");
			
			transferir_Fichero(fileIn, fileOut);
				
		}catch(Exception e) {
			System.out.println("El programa no está funcionando. " + e.getMessage());
		}
		
	}

	static void transferir_Fichero(InputStream fileIn, PrintStream fileOut) {
		
		//.readAllBytes() solo recomendable para archivos pequeños
		try {
		byte[] datos = fileIn.readAllBytes();
			fileIn.close();
			
			fileOut.write(datos);
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
