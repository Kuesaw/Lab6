import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;

        String trash;
        boolean done;

        // Get width
        done = false;
        do {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        // Get height
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("Please enter a valid number.");
            }

        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}