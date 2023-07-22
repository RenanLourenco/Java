public class Switch {
    public static void main(String[] args) {
        // switch statement

        int day = 7;
        String dayName = switch (day) {
            case 0 -> "Domingo";
            case 1 -> "Segunda";
            case 2 -> "Terca";
            case 3 -> "Quarta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6 -> "Sabado";
            default -> "Dia Invalido";
        };


        System.out.println(String.format("Hoje e %s", dayName));

    }
}
