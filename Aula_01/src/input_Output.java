import java.util.Locale;
import java.util.Scanner;

public class input_Output {

    public static void main(String[] args) {
        // Define a localidade para usar a vírgula como separador decimal
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);

        double x;
        String y;
        char z;

        System.out.println("Por favor, digite um número: ");
        x = sc.nextDouble();

        System.out.println("Por favor, digite um caractere: ");
        z = sc.next().charAt(0);

        // Lê uma linha inteira de entrada como uma string
        sc.nextLine();

        System.out.println("Por favor, digite uma frase: ");
        y = sc.nextLine();

        // Usando printf para formatar a saída com a localidade configurada
        System.out.printf("O número é: %.2f%n", x);
        System.out.println("Você digitou: " + z);
        System.out.println("Você digitou: " + y);

        sc.close();
    }
}