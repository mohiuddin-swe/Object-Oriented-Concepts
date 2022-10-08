import java.util.Scanner;
import java.util.Arrays;

public class Arrays_with_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array you want :");
        int n = in.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter " + n + " names :");

        for (int i=0; i<n ;i++)
        {
            arr[i] = in.next();
        }

        System.out.println("The names are : ");

        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
