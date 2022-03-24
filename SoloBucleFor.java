package proyecto1;

public class SoloBucleFor {
	
	/*
	 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

	Tened en cuenta que los textos pueden venir de un array de tipo String.

	Por ejemplo: String[] nombres = {"", "", "", ""}
	 */

	public static void main(String[] args) {
		
		String[] nombres = new String[]{"Juan", "Pedro", "Ignacio", "Sebastián", "Pablo"};

		for(int i=0; i < nombres.length; i++){
			System.out.println("El array contiene el nombre " + nombres[i] + " en posición " + i);
		}
	}
}