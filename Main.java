
public class Main {
	public static void main(String[] args) {

		int numeroIf = 5;

		if (numeroIf > 0) {
			System.out.println("numeroIf es positivo");
		} else if (numeroIf < 0) {
			System.out.println("numeroIf es negativo");
		} else {
			System.out.println("numeroIf es igual a 0");
		}

		int numeroWhile = 0;

		while (numeroWhile < 3) {
			System.out.println("While: Valor de numeroWhile es " + numeroWhile);
			numeroWhile++;
		}

		do {
			System.out.println("Do-While: Valor de numeroWhile es " + numeroWhile);
		} while (numeroWhile < 3);

		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("For: Valor de numeroFor es " + numeroFor);
		}

		String estacion = "Verano";

		switch (estacion.toLowerCase().trim()) {
		case "primavera":
			System.out.println("La estación del año es " + estacion);
			break;
		case "verano":
			System.out.println("La estación del año es " + estacion);
			break;
		case "otoño":
			System.out.println("La estación del año es " + estacion);
			break;
		case "invierno":
			System.out.println("La estación del año es " + estacion);
			break;
		default:
			System.out.println("Error: La estación del año no es valido");
			break;
		}

	}
}
