//BEGIN
    // Step 1: Ask for subtotal and gratuity rate
    // PRINT "Please enter Subtotal and Gratuity Rate: "
    // INPUT subtotal
    // INPUT gratuityperc

    // Step 2: Check for invalid input
    // IF subtotal < 0 OR gratuityperc < 0 THEN
        // PRINT "Invalid input, enter positive values."
        // EXIT

    // Step 3: Calculate Gratuity and Total
    // SET gratuity = subtotal * (gratuityperc / 100)
    // SET total = subtotal + gratuity

    // Step 3: Display Result
    // PRINT "Gratuity: $", gratuity
    // PRINT "Total: $", total
// END

import java.util.Scanner;

public class TaxTotal {
    public static void main(String[] args) throws Exception {
       
        Scanner input = new Scanner(System.in);

        // Ask for subtotal and gratuity rate
        System.out.print("Please enter Subtotal and Gratuity Rate: ");
        double subtotal = input.nextDouble();
        double gratuityperc = input.nextDouble();

        // Checker for valid input
        if (subtotal<0 || gratuityperc < 0) {
            System.out.println("Input invalid, please enter positive values.");
            return;
        }

        // Calculate Gratuity & Total
        double gratuity = subtotal * (gratuityperc / 100);
        double total = subtotal + gratuity;

        // Display Result
        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}

