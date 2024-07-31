import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the source unit (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char sourceUnit = scanner.next().toUpperCase().charAt(0);

        System.out.println("Enter the target unit (C for Celsius, F for Fahrenheit, K for Kelvin):");
        char targetUnit = scanner.next().toUpperCase().charAt(0);

        double convertedTemperature = 0;

        switch (sourceUnit) {
            case 'C':
                if (targetUnit == 'F') {
                    convertedTemperature = celsiusToFahrenheit(temperature);
                } else if (targetUnit == 'K') {
                    convertedTemperature = celsiusToKelvin(temperature);
                } else if (targetUnit == 'C') {
                    convertedTemperature = temperature; // No conversion needed
                } else {
                    System.out.println("Invalid target unit.");
                    return;
                }
                break;
            case 'F':
                if (targetUnit == 'C') {
                    convertedTemperature = fahrenheitToCelsius(temperature);
                } else if (targetUnit == 'K') {
                    convertedTemperature = fahrenheitToKelvin(temperature);
                } else if (targetUnit == 'F') {
                    convertedTemperature = temperature; // No conversion needed
                } else {
                    System.out.println("Invalid target unit.");
                    return;
                }
                break;
            case 'K':
                if (targetUnit == 'C') {
                    convertedTemperature = kelvinToCelsius(temperature);
                } else if (targetUnit == 'F') {
                    convertedTemperature = kelvinToFahrenheit(temperature);
                } else if (targetUnit == 'K') {
                    convertedTemperature = temperature; // No conversion needed
                } else {
                    System.out.println("Invalid target unit.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid source unit.");
                return;
        }

        System.out.printf("The converted temperature is: %.2f %c%n", convertedTemperature, targetUnit);
    }
}
