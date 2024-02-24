package Igor_Questao_1.pkg4;
import java.util.Scanner;
public class Igor_Questao_1 {

    public static void main(String[] args) {
      float number1, number2, number3, average, recpar, average_final;
        Scanner input = new Scanner (System.in);
       
        System.out.println("Digite as notas das suas três avaliações.");
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        number3 = input.nextFloat();
        average = (number1 + number2 + number3)/3;
        System.out.println("Sua média é: "+average);
        if(average>=7){
            System.out.println("Você foi aprovado!");
        }
        
        else{
            System.out.println("Reprovado. Digite a nota da recuperação.");
            recpar = input.nextFloat();
            average_final = (average + recpar)/2;
            
            if(average_final>=5){
                System.out.println("Aprovado. Sua média final é de " + average_final + " pontos.");
            }
            else{
                System.out.println("Você foi reprovado definitivamente .Sua média final é: "+ average_final);
            }
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


