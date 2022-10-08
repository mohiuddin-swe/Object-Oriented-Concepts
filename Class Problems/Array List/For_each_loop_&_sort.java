import java.util.ArrayList;
import java.util.Collections;

public class For_each_loop_&_sort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        Collections.sort(cars);  //// Sort cars

        for(String i : cars){
            System.out.println(i);
        }

        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(0,"Opel");
        System.out.println(cars.get(0));
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());
    }
}
