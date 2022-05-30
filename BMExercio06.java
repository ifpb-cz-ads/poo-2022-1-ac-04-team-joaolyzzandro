
import java.util.Scanner;

public class BMExercio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia = 1;

        while (dia != 0) {

            System.out.println("Digite um numero de 1 a 7: ");
            dia = input.nextInt();

            String mensagem;

            switch (dia) {
                case 1:
                    mensagem = "Domingo";
                    break;
                case 2:
                    mensagem = "Segunda";
                    break;
                case 3:
                    mensagem = "Terca";
                    break;
                case 4:
                    mensagem = "Quarta";
                    break;
                case 5:
                    mensagem = "Quinta";
                    break;
                case 6:
                    mensagem = "Sexta";
                    break;
                case 7:
                    mensagem = "Sabado";
                    break;
                default:
                    mensagem = "Dia invalido";
            }
            System.out.println(mensagem);
        }
        input.close();

    }
}