/**
 * 8. Escreva um programa que imprima todos os múltiplos de 3, entre 1 e 100.
 */
public class BMExercicio08 {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 100) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
