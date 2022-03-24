package proyecto1;

public class Funcion1 {

	public static void main(String[] args) {
		
		double price = 105.99;

		System.out.println("El precio con IVA es: " + totalPrice(price));
	}

	static double totalPrice(double price){
		double resultado;
		resultado = price * 1.21;
		return resultado;
	}
}
