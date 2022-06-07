/**
 * Atividade prática 5
 * Faça um programa que imprima os números pares de 0 a 100.
 */
public class CBBAtividadePratica5 {
    public static void main(String[] args) {
        int numero = 0;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}