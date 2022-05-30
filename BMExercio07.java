import java.util.Scanner;

public class BMExercio07 {
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
