package Igor_Questao_3.pkg4;
import java.util.Scanner;
public class Igor_Questao_3 {
    public static void main(String[] args) {
        
        int number, second1, second2, minute1, minute2, hour1, hour2, sum, dif, minute, second, hour, total1, total2;
        float hours, minutes, seconds;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro a horário: ");
        hour1 = teclado.nextInt();
        System.out.println("minuto/s: ");
        minute1 = teclado.nextInt();
        System.out.println("segundo/s: ");
        second1 = teclado.nextInt();
        System.out.println("Digite o segundo horário: ");
        hour2 = teclado.nextInt();
        System.out.println("minuto/s: ");
        minute2 = teclado.nextInt();
        System.out.println("segundo/s: ");
        second2 = teclado.nextInt();
        System.out.println("Escolha a operação:\n • SOMA \n • DIFERENÇA");
        number = teclado.nextInt();

        total1 = ((hour1 * 3600) + (minute1 * 60) + second1);
        total2 = ((hour2 * 3600) + (minute2 * 60) + second2);

        if (number == 1) {
            sum = (total1 + total2);
            hours = sum / 3600;
            minutes = (hours % 3600) / 60;
            seconds = (hours % 3600) % 60;
            System.out.printf("A soma das horas é: %.0f:%.0f:%.0f",hours,minutes,seconds);

        } else if (total1 > total2) {
            dif = total1 - total2;
        } else {
            dif = (total2 - total1);
            hours = dif / 3600;
            minutes = (hours % 3600) / 60;
            seconds = (hours % 3600) % 60;
            System.out.printf("A diferença das horasé: %.0f:%.0f:%.0f",hours,minutes,seconds);
        }

    }  
}



//IGOR///               ////////////
/////////         //////////////////////
/////////      /////////         /////////
/////////      /////////         
/////////      /////////            IGOR
//IGOR///      /////////         
/////////      /////////      /////////////
/////////      /////////         /////////
/////////      /////////         /////////
//IGOR///      /////////         /////////
/////////      /////////         /////////
/////////          /////////////////////
/////////               //////////
