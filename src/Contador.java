import java.util.Scanner;
public class Contador {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(" O segundo parametro deve ser maior do que o primeiro");
        }

    }

    static void contar (int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        } 
           
        int contagem = numero2 - numero1;
        

        for (int indice = 1; indice <= contagem; indice++ ) {
            System.out.println("Imprimindo o número " + indice);

        }

    }
}
