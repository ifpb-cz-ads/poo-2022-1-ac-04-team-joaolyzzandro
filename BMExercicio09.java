/**
 * 9. Escreva um programa que implemente um laço while que execute 20 vezes,
 * imprimindo o valor da variável x que inicialmente está com valor 10.
 */
public class BMExercicio09 {
    public static void main(String[] args) {
        int numero = 10;
        int contador = 20;

        while (contador > 0) {
            System.out.print(numero + "  ");
            contador--;
        }
    }
}
