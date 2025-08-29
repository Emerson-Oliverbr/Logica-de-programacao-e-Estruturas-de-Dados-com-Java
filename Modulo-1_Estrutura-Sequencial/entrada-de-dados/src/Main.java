import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		float altura;
		char letraInicial;
		
		nome  = sc.next();
		idade = sc.nextInt();
		altura = sc.nextFloat();
		letraInicial = sc.next().charAt(0);
		
		System.out.println();
		System.out.println("Dados Digitados: ");
		System.out.println("Nome: " + nome);  
		System.out.println("Idade: " + idade);		
		System.out.printf("Altura: %.2f\n" , altura);  
		System.out.printf("Letra inicial: " + letraInicial + "\n");  
		
		String s1, s2, s3;
		
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Nomes digitados: ");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
