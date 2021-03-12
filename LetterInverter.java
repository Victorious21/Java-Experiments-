//Imports
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.util.Scanner;

public class LetterInverter
{

    public static String invertString(String input)
    {
        String output = "";

        for (int i = 0; i < input.length(); i++)
        {
            String s = input.substring(i, i + 1).toLowerCase();

            if(i % 2 == 0)
            {
                output += s.toUpperCase();
            }
            else
            {
                output += s;
            }
        }
        return output;
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word or phrase: ");
        String input = scan.nextLine();
        System.out.println("Message copied to clipboard!");

        //-----------------------------------------------------------

        //This section copies the product to clipboard
        String myString = LetterInverter.invertString(input);
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}
