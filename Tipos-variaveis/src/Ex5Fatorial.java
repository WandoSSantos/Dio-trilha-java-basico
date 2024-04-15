import java.util.Scanner;

public class Ex5Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o valor que deseja saber a fatorial: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		for (int i=fatorial;i >= 1;i--) {
			multiplicacao = multiplicacao * i;
		}
		System.out.println("O valor fatorial de" + fatorial + " é: " + multiplicacao);
	}

}
