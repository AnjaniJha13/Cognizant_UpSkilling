import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();
        //Arithmetic Operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;


        switch (choice) {
            case 1:
                System.out.println("Addition: " + addition);
                break;
            case 2:
                System.out.println("Subtraction: " + subtraction);
                break;
            case 3:
                System.out.println("Multiplication: " + multiplication);
                break;
            case 4:
                // Fix: Check for zero and use (double) for decimals
                if (num2 != 0) {
                    double division = (double) num1 / num2;
                    System.out.println("Division: " + division);
                } else {
                    System.out.println("Division: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
    
}
