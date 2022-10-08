import java.io.PrintStream;
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your choice... : ");
        System.out.println("1. Biriyani\n2. Khichuri\n3. dal-vat\n ");
                int choice = in.nextInt();
                if(choice == 1){
                    System.out.println("You have selected Biriyani");
                }
                else if(choice == 2){
                    System.out.println("You have selected Khichuri");
                }
                else if(choice == 3){
                    System.out.println("You have selected dal-vat");
                }
                else{
                    System.out.println("Invalid choice");
                }
    }
}
