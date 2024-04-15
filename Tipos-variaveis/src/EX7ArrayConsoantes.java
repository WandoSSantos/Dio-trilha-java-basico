import java.util.Scanner;

public class EX7ArrayConsoantes {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
                
            System.out.println("Digite uma letra: ");
            String letra = scan.next();
            

            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") ||letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                System.out.println("A letra que você digitou é vogal");
            } else{
                System.out.println(" A letra "+letra +" é consoante ");
            }

        scan.close();
    }
    
}
