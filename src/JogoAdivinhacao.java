import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int tentativa = 0;
        int maxTentativas = 5;
        int round = 0;

        System.out.println(randomNumber);

        System.out.println("""
                **********************************************
                
                Jogo da adivinhacao
               
                ********************************************* 
                """);


        while(tentativa != randomNumber){
            if(round != maxTentativas){
                System.out.println("Digite o numero");
                tentativa = leitura.nextInt();

                if(tentativa == randomNumber){
                    System.out.println("Parabens vc acertou!!!!");
                    break;
                }else if(tentativa < randomNumber){
                    System.out.println("Voce errou tente novamente, numero menor que o numero randomico");
                    round++;
                }else if(tentativa > randomNumber){
                    System.out.println("Voce errou tente novamente, numero maior que o numero randomico");
                    round++;
                }

            }else{
                System.out.println("ACABOU AS TENTATIVAS !!!");
                break;
            }

        }

    }


}
