// 01
public class TemperatureConverter {
    public static double convertTemperature(double temp, char fromUnit, char toUnit) {
        // temp: temperature in the original unit (Celsius or Fahrenheit)
        // fromUnit: input temperature unit ('C' for Celsius and 'F' for Fahrenheit)
        // toUnit: output temperature unit ('C' for Celsius and 'F' for Fahrenheit)020
    
        if (fromUnit == 'C') {
            if (toUnit == 'F') {
                return (temp * 9/5) + 32;
            } else if (toUnit == 'C') {
                return temp;
            } else {
                throw new IllegalArgumentException("Invalid toUnit. Please use 'C' for Celsius or 'F' for Fahrenheit.");
            }
        } else if (fromUnit == 'F') {
            if (toUnit == 'C') {
                return (temp - 32) * 5/9;
            } else if (toUnit == 'F') {
                return temp;
            } else {
                throw new IllegalArgumentException("Invalid toUnit. Please use 'C' for Celsius or 'F' for Fahrenheit.");
            }
        } else {
            throw new IllegalArgumentException("Invalid fromUnit. Please use 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
    public static void main(String[] args) {
        // Convert 20 degrees Celsius to Fahrenheit0
        double convertedTemp1 = convertTemperature(20, 'C', 'F');
        System.out.println("20 degrees Celsius is equivalent to " + convertedTemp1 + " degrees Fahrenheit.");

        // Convert 68 degrees Fahrenheit to Celsius
        double convertedTemp2 = convertTemperature(68, 'F', 'C');
        System.out.println("68 degrees Fahrenheit is equivalent to " + convertedTemp2 + " degrees Celsius.");
    }
}
