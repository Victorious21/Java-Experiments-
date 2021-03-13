import java.util.Scanner;

public class TemperatureConverter2
{
    //From Celsius to Fahrenheit
    public static void celsiusToFahrenheit(double temp)
    {
        temp = (temp * 9 / 5) + 32;
        System.out.print("Temperature: " + temp);
    }
    //From Fahrenheit to Celsius
    public static void fahrenheitToCelsius(double temp)
    {
        temp = (temp - 32) * 5 / 9;
        System.out.print("Temperature: " + temp);
    }
    //From Celsius to Kelvin
    public static void celsiusToKelvin(double temp)
    {
        temp =  temp + 273.15;
        System.out.print("Temperature: " + temp);
    }
    //From Fahrenheit to Kelvin
    public static void fahrenheitToKelvin(double temp)
    {
        temp = ((temp - 32) * 5 / 9) + 273.15;
        System.out.print("Temperature: " + temp);
    }
    //From Kelvin to Celsius
    public static void kelvinToCelsius(double temp)
    {
        temp = temp - 273.15;
        System.out.print("Temperature: " + temp);
    }
    //From Kelvin to Fahrenheit
    public static void kelvinToFahrenheit(double temp)
    {
        temp = (temp - 273.15) * 9/5 + 32;
        System.out.print("Temperature: " + temp);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter which way you would like to convert: ");
        String way = scan.nextLine();
      
        //Testing to check if input id correct
        if(!(way.equalsIgnoreCase("F to C") ||way.equalsIgnoreCase("C to F") || way.equalsIgnoreCase("C to K") || way.equalsIgnoreCase("F to K") || way.equalsIgnoreCase("K to C") || way.equalsIgnoreCase("K to F")))
        {
            System.out.print("Invalid input, possible inputs are: \n Celsius to Fahrenheit -> C to F \n Fahrenheit to Celsius -> F to C \n Fahrenheit to Kelvin -> F to K \n Kelvin to Fahrenheit -> K to F \n Celsius to Kelvin -> C to K \n Kelvin to Celsius -> K to C");
        }
      
      //Only runs if the previous conditions are met
        else
        {
            System.out.print("Enter the temperature: ");
            double temp = scan.nextDouble();

            if(way.equalsIgnoreCase("C to F"))
            {
                celsiusToFahrenheit(temp);
            }
            else if(way.equalsIgnoreCase("F to C"))
            {
                fahrenheitToCelsius(temp);
            }
            else if(way.equalsIgnoreCase("C to K"))
            {
                celsiusToKelvin(temp);
            }
            else if(way.equalsIgnoreCase("F to K"))
            {
                fahrenheitToKelvin(temp);
            }
            else if(way.equalsIgnoreCase("K to C"))
            {
                kelvinToCelsius(temp);
            }
            else if(way.equalsIgnoreCase("K to F"))
            {
                kelvinToFahrenheit(temp);
            }
        }
    }
}
