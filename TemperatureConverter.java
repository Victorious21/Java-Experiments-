import java.util.Scanner;
public class TemperatureConverter
{
    public static String convert(double temp, String type)
    {
        // Celsius to Fahrenheit
        if(type.equalsIgnoreCase("Fahrenheit") || type.equalsIgnoreCase("F"))
        {
            temp = (temp * 9 / 5) + 32;
            return "Temperature in Fahrenheit: " + temp;
        }
        //Fahrenheit to Celsius
        else if(type.equalsIgnoreCase("Celsius") || type.equalsIgnoreCase("C"))
        {
            temp = (temp - 32) * 5 / 9;
            return "Temperature in Celsius: " + temp;
        }
        //Kelvin - Had a mental breakdown trying to code this part, tried to put the Celsius formula + 273.15. Finally figured out that I just needed to take the input and add 273.15 (Mind blown!)
        else if(type.equalsIgnoreCase("Kelvin") || type.equalsIgnoreCase("K"))
        {
            return "Temperature in Kelvin: " + (temp + 273.15);
        }
        return type;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Asking for user input
        System.out.println("What type of temperature conversion? \n - Enter C to convert from F to C \n - Enter F to convert to convert from C to F \n - Enter K to convert to convert from C to K");
        String type = scan.nextLine();

        //Checks if user input is correct and follows instructions - to not throw error of course :)
        if(!(type.equalsIgnoreCase("Fahrenheit") || type.equalsIgnoreCase("F") || type.equalsIgnoreCase("Celsius") || type.equalsIgnoreCase("C") || type.equalsIgnoreCase("Kelvin") || type.equalsIgnoreCase("K")))
        {
            System.out.println("Please follow the instructions.");
        }
      
      //Only runs when user puts in the correct input
        else
        {
            System.out.println("What is the temperature?");
            double temp = scan.nextDouble();

            System.out.println(convert(temp, type));
        }
    }
}
