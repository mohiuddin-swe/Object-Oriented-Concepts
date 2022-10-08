import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = in.nextInt();

        if(num>0 && num<11)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(num+" x "+ i +" = "+ num*i);
            }
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
}
