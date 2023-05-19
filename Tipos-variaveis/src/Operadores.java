public class Operadores {

    public static void main(String[] args)  {

        //classe Operadores.java
        double soma = 10.5 + 15.7;

        System.out.println(soma);

        int subtracao = 113 - 25;

        System.out.println(subtracao);

        int multiplicacao = 20 * 7;

        System.out.println(multiplicacao);

        int divisao = 15 / 3;

        System.out.println(divisao);

        int modulo = 18 % 3;

        System.out.println(modulo);

        double resultado = (10 * 7) + (20/4);

        System.out.println(resultado);

        // ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos"
        
        //classe Operadores.java
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
    }
}