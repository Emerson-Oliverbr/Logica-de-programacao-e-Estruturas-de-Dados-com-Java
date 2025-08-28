import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá, Mundo!");
		System.out.print("Bom dia!");
		System.out.println("Tudo bem com voce!");
		
		int y = 32;
		double x = 1.50;
		
		System.out.println("Valor de y: " + y);
		System.out.println("Valor de x: " + x);
		System.out.printf("Valor de x com duas casas decimais: %.2f\n ", + x);
		System.out.printf("Valor de x com três casas decimais: %.3f\n ", + x);
		Locale.setDefault(Locale.US);
		System.out.printf("Valor de x com três casas decimais e ponto como separador decimal: %.3f\n ", + x);
	}
}
