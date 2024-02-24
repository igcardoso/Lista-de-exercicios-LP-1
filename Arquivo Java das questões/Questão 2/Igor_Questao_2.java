package Igor_Questao_2.pkg4;
import java.util.Scanner;

public class Igor_Questao_2 {

    public static void main(String[] args) {
        // variáveis
        float flatA, flatB;
        int books;
        
        // leitor dos valores de input
        Scanner input = new Scanner(System.in);
        
        System.out.println("No plano (A) você paga  R$ 0,25 por livro, mais o valor fixo de R$ 7,50. \nNo plano (B), você paga R$ 0,50 por livro, mais o valor fixo de R$ 2,50. \n Indicaremos o plano de compra ideal para você! Basta digite a quantidadde de livros que deseja comprar.");
        books = input.nextInt();
        flatA = (float) ((books * 0.25) + 7.50);
        flatB = (float) ((books * 0.50) + 2.50);
        System.out.println("Aqui está um comparativo dos planos: Plano (A) R$" + flatA + " \nPlano (B) R$" + flatB);
        if (flatA == flatB) {
            System.out.println("Ambos os planos são indicados pra você.");
        } else if (flatA > flatB) {
            System.out.println("Feito o comparativo de melhor opção. o plano (B) demostrou-se uma melhor opção de compra.");
        } else {
            System.out.println("Feito o comparativo de melhor opção. o plano (B) demostrou-se uma melhor opção de compra.");

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


