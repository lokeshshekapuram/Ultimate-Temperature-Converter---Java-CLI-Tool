import java.util.*;

public class UlitmateTemperatureConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Ultimate Temperature Converter ");
        System.out.println("Please choose the scale you want to convert from:");
        System.out.println(" 1.Celsius\n 2. Farenheit\n 3.Kelvin");

        int scaleChoice = sc.nextInt();
        System.out.print("Enter the temperature you wish to convert:");
        double temperature = sc.nextInt();

        switch (scaleChoice){
            case 1:
                convertFromCelcius(temperature);
                break;
            case 2:
                convertFromFahrenheit(temperature);
                break;
            case 3:
                convertFromKelvin(temperature);
                break;
            default:
                System.out.println("Invalid choice! Please select a Valid Option. ");
        }
        sc.close();

    }
    public static void convertFromCelcius(double celsius){
        double fahrenheit = (celsius * 9/5)+32;
        double kelvin = celsius +273.15;
        System.out.printf("Celsius to Fahrenheit : %.2fF%n",fahrenheit);
        System.out.printf("Celsius to Kelvin: %.2fK%n",kelvin);
    }
    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        System.out.printf("Fahrenheit to Celsius: %.2f°C%n", celsius);
        System.out.printf("Fahrenheit to Kelvin: %.2fK%n", kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        System.out.printf("Kelvin to Celsius: %.2f°C%n", celsius);
        System.out.printf("Kelvin to Fahrenheit: %.2f°F%n", fahrenheit);
    }

}
