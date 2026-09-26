//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class kioskAge
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Variable Declarations
        double personsAge = 0;
        String trash = "";

        // input values from the user
        System.out.print("Please enter your age: ");

        if (in.hasNextDouble())
        {
            // OK safe to read in a number
            personsAge = in.nextDouble();
            in.nextLine();

            // process them
            if (personsAge >= 21)
            {
                System.out.println("Please take your wristband.");
            }
        }
        else
        {
            // Not a number, so can't use nextDouble()!
            trash = in.nextLine();

            System.out.println("\nYou entered: " + trash);
            System.out.println("Please enter a valid age.");
        }
    }

}