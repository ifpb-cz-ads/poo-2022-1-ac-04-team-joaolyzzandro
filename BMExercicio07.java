
/**
 * 7. Escreva um programa que, dada uma variável x (com valor 180, por exemplo), temos y de acordo com a seguinte regra: 
 * se x é par, y = x / 2
 * se x é impar, y = 3 * x + 1
 * imprime y
 * O programa deve então jogar o valor de y em x e continuar até que y
 * tenha o valor final de 1.
 * Por exemplo, para x = 13, a saída será:
 * 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */
import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        int numero = input.nextInt();
        int numero2;

        while (numero > 1) {
            if (numero % 2 == 0) {
                numero2 = numero / 2;
            } else {
                numero2 = 3 * numero + 1;
            }

            numero = numero2;

            if (numero2 > 1) {
                System.out.print(numero2 + " -> ");
            } else {
                System.out.print(numero2);
            }

        }

        input.close();
    }
}
