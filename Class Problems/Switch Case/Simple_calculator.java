import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 1;
        while(flag ==1) {
            System.out.printf("Enter first number : ");
            double num1 = in.nextDouble();
            System.out.printf("Enter second number : ");
            double num2 = in.nextDouble();

            System.out.println("\nEnter operation");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition of two numbers : " +num1 +" + "+num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction of two numbers : " +num1 +" - "+num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Multiplication of two numbers : " +num1 +" * "+num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Division of two numbers : " +num1 +" / "+num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Modulus of two numbers : " +num1 +" % "+num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println("Invalid choice...");
                    break;
            }
            System.out.println("Do you want to continue? (1/0)");
            flag = in.nextInt();
        }
    }
}
