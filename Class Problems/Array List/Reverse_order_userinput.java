import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_order_userinput {
    public static void main(String[] args) {
       // arraylist reverse order  printing
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
         int n = in.nextInt();

         for (int i = 0; i < n; i++) {
             list.add(in.next());
         }

            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }

    }
}
