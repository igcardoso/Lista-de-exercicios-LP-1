package igor_questão.pkg4;

import java.util.Scanner;

public class Igor_questão4 {
    public static void main(String[] args) {
        int cont = 0, number;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero maior que 0, logo abaixo");
        number = teclado.nextInt();
        if (number == 0) {
            cont = 1;
        } else {
            while (number > 0) {
                number /= 10;
                cont++;
            }

        }
        System.out.println("A quantidade de dígitos desse número é: " + cont);

    }  
}
