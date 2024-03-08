import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter the operation (1-5): ");
            int operation = scanner.nextInt();

            
            if (operation == 5) {
               
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            } else if (operation >= 1 && operation <= 4) {
                double result;
                
                if (operation == 1) {
                    result = num1 + num2;
                } else if (operation == 2) {
                    result = num1 - num2;
                } else if (operation == 3) {
                    result = num1 * num2;
                } else {
                    
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero. Please enter a non-zero divisor.");
                        continue; 
                    }
                }
            
                System.out.println("Result: " + result);
            } else {
                
                System.out.println("Invalid operation. Please enter a number between 1 and 5.");
            }
        }

      
        scanner.close();
    }
}
