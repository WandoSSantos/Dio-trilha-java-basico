import java.util.Scanner;

public class Ex3MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		
		float soma =0;
		
		int count = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			if (numero > maior) maior = numero;
			soma = soma + numero;
			count ++;
		} while(count < 5);
		
		System.out.println("O maior numero entre os valores digitados é : " + maior);
		System.out.println("A média dos valores digitados é: " + soma/5);
	}

}
