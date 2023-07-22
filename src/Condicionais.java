public class Condicionais {
    public static void main(String[] args) {
        int launchYear = 2023;
        boolean includedInMembership = false;
        double rating = 7.0;
        String tipoPlano = "plus";

        if (launchYear == 2023){
            System.out.println("Filme lançamento");
        }
        if (includedInMembership == false){
            System.out.println("Filme nao incluso no plano");
        }else {
            System.out.println("Filme incluso no plano");
        }

        if(rating <= 7.0){
            System.out.println("Filme com alta expectativa mas qualidade baixa");
        }else{
            System.out.println("Otimo filme aclamado pelas criticas");
        }

        if(includedInMembership == true || tipoPlano.equals("plus")){
            System.out.println("Liberado");
        }else {
            System.out.println("Deve pagar a locacao");
        }

    }
}
