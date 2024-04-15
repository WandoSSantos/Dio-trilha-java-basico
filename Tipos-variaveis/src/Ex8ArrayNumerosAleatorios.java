import java.util.Random;

public class Ex8ArrayNumerosAleatorios {

    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i =0; i<numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;


        }

        System.err.println("Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.err.println(numero);            
        }

    }
    
}
