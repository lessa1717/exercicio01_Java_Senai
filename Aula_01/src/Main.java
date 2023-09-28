import java.util.Locale;
import java.text.NumberFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Exercicio 1 - Crie um programa em que deve ser armazenado o nome, idade e o salário de uma pessoa.
        //Onde na saída dos dados devem ser apresentados o nome, idade e concatenado com o Salário.
        String nome = "Lucas";
        int idade = 31;
        double salario  = 1.000f;



        System.out.printf(nome+" tem "+idade+" e ganha $%.3f Reais\n",salario);


        //Exercício 2 - Crie um programa em que deve ser armazenado o nome, idade, altura e Sexo da pessoa e no final imprima as informações que foram armazenadas.

        String nome1 = "Cézar";
        int idade1 = 64;
        double  altura = 1.70f;
        String sexo = "masculino" ;

        System.out.printf(nome1+" tem "+idade1+" e altura %.2f",altura," do sexo "+sexo);



        }
    }
