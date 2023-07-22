import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> months = new ArrayList<String>();
        months.add("Janeiro");
        months.add("Fevereiro");
        months.add("Marco");
        months.add("Abril");
        months.add("Maio");
        months.add("Junho");
        months.add("Julho");
        months.add("Agosto");
        months.add("Setembro");
        months.add("Novembro");
        months.add("Dezembro");

        /*

                        "Janeiro",
                "Fevereiro",
                "Marco",
                "Abril",
                "Maio",
                "Junho",
                "Julho",
                "Agosto",
                "Setembro",
                "Novembro",
                "Dezembro"
         */

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lancamento");
        int anoLancamento = leitura.nextInt();



        System.out.println("De sua nota");
        double notaUser = leitura.nextDouble();

        leitura.nextLine();

        if(anoLancamento != 2023){
            System.out.println(String.format("O filme %s nao e um lancamento", filme));
        }else {
            System.out.println("Digite o mes de lancamento");
            String mes = leitura.nextLine();

            if(months.contains(mes)){
                String response = String.format("""
                          O Lancamento e o filme %s, 
                          lancado no mes %s,
                          e o usuario deu a nota de: %.1f
                    
                        """, filme, mes, notaUser);
                System.out.println(response);
            }else {
                System.out.println("Mes invalido");
            }
        }
        leitura.close();

    }

}
