import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int totalDeNotas = 0;
        double nota = 0;
        double mediaAvaliacao = 0;

        while(nota != -1){
            System.out.println("De sua nota ao filme, digite -1 para sair");
            nota = leitura.nextDouble();

            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }

        System.out.println("Media de avaliacoes " + mediaAvaliacao / totalDeNotas);

    }
}
