import java.util.Scanner;

class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Welcome to Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                double num1, num2;

                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + Calculator.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + Calculator.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + Calculator.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + Calculator.division(num1, num2));
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting Calculator :)");
            } else {
                System.out.println("Invalid choice, try again : ");
            }
        } while (choice != 5);

        sc.close();
    }
}


