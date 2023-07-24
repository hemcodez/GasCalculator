import java.util.Scanner;

public class GasCalculator {
    public static void main(String[] args) {

        //Ask the user how many miles to a gallon they get in their car
        System.out.println("How many miles to a gallon do you get in your car?");

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Get input from the user
        int fuelUsage = input.nextInt();

        //Ask the user to enter the length og their trip from work to home
        System.out.println("What is your mileage from home to work?");

        //Get input from the user
        int mileage = input.nextInt();

        //Calculate how much gas they use to drive to work
        double MPG = (double)fuelUsage / (double)mileage;

        //Display entered input and fuel consumption
        System.out.println("You have " + fuelUsage + " miles to a galllon in your vehicle." + " Your mileage from work to home is " + mileage);
        System.out.println("Your fuel consumption is " + MPG);
    }
}
