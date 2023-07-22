// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Fahrenheit to Celsius
        int temperatureCelsius = 32;
        double temperatureFahrenheit = (temperatureCelsius * 1.8) + 32;


        String response = String.format("""
                *************************************************************
                    Celsius to Fahrenheit converter
                    
                    Celsius temperature: %d
                    
                    Converted: %.1f
                
                """,temperatureCelsius,temperatureFahrenheit);


        System.out.println(response);


    }

    static int doubleValue(int value){
        return value * 2;
    }
}