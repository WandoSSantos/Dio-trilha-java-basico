
public class Ex6ArrayOrdemInversa {

	public static void main(String[] args) {
		
		int [] vetor = {-5, -6, 15, 50, 8, 4};
		
		System.out.println("Vetor: ");
		
		int count = 0;
		
		while(count < (vetor.length)) {
			System.out.println(vetor[count]);
			count++;
		}
		
		System.out.println("Vetor: ");
		
		for(int i= (vetor.length);i ==0; i--) {
			System.out.println(vetor[i]+ " ");
		}
		
	}

}
