import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double price = 0;

        String trash;
        boolean done;

        // Get gallons
        done = false;
        do {
            System.out.print("Enter the number of gallons in the tank: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        // Get MPG
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in MPG: ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        // Get price
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");

            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        double cost100Miles = (100.0 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println();
        System.out.println("Cost to drive 100 miles: $" + cost100Miles);
        System.out.println("Distance with a full tank: " + distance + " miles");
    }
}