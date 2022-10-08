import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       String[] name = {"Abid", "Asif" , "Farha" , "Shamim"};
       int[] serial = {1,2,3,4};
       String[] gender = {"Male","Male","Female","Male"};

       int i;

        System.out.println(name.length);
        System.out.println("**Student information**");

       for (i=0; i<name.length ;i++)
       {
           System.out.println("-----------------------\n");
           System.out.println("Serial : "+serial[i]+ "\n");
           System.out.println("Name : "+name[i]+ "\n");
           System.out.println("Gender : "+gender[i]+ "\n");
           System.out.println("-----------------------\n");
       }
    }
}
