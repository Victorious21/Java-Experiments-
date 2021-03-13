import java.util.Scanner;

public class TemperatureConverter3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter which way you would like to convert: \n C to F \n F to C \n C to K \n F to K \n K to C \n K to F ");
        String way = scan.nextLine();
        System.out.print("Enter the temperature: ");
        double temp = scan.nextDouble();

        if(way.equalsIgnoreCase("C to F"))
            System.out.println("Temperature converted from Celsius to Fahrenheit: " + ((temp * 9 / 5) + 32));

        else if(way.equalsIgnoreCase("F to C"))
            System.out.println("Temperature converted from Fahrenheit to Celsius: " + ((temp - 32) * 5 / 9));

        else if(way.equalsIgnoreCase("C to K"))
            System.out.println("Temperature converted from Celsius to Kelvin: " + (temp + 273.15));

        else if(way.equalsIgnoreCase("F to K"))
            System.out.println("Temperature converted from Fahrenheit to Kelvin: " + ((temp - 32) * 5 / 9 + 273.15));

        else if(way.equalsIgnoreCase("K to C"))
            System.out.println("Temperature converted from Kelvin to Celsius: " + (temp - 273.15));

        else if(way.equalsIgnoreCase("K to F"))
            System.out.println("Temperature converted from Kelvin to Fahrenheit: " + ((temp - 273.15) * 9/5 + 32));
    }
}
