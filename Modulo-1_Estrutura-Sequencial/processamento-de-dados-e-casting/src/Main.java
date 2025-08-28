public class Main {

	public static void main(String[] args) {
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		double z = 10;
		
		System.out.println(z);
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("Valor da area: " + area);
		
		int v1, v2;
		double resultado, resultado2;
		v1 = 5;
		v2 = 2;
		
		resultado = v1 + v2;
		resultado2 = v1 / v2;
		
		System.out.println("A soma de: " + v1 + " + " +  v2 + " = " + resultado);
		System.out.println("A divisao de: " + v1 + " / " +  v2 + " = " + resultado2);
		
		resultado2 = (double) v1 / v2;
		
		System.out.println("A divisao de: " + v1 + " / " +  v2 + " = " + resultado2);
		
	}

}
