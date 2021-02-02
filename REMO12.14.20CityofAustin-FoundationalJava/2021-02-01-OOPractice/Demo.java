import java.util.*;

class Vehicle1 {
    int wheels = 4;
}
public class Demo {
    int x = 5;

    public static void main(String[] args) {
        Vehicle1 myObject = new Vehicle1();
//        System.out.println(myObject.wheels);
//        Stack<String> a = new Stack<>();
//        ArrayList<String> a = new ArrayList<>();
        Weather rain = new Rainy();
        Weather sun = new Sunny();
        Weather snow = new Snowing();

        Weather[] myWeathers = {rain, sun, snow};


        for (Weather w : myWeathers) {
            w.precipitate();
        }
        final int[] a = {1,2,3,4,5};
        final int[] b = {1,8,3,4,5};
//        a = b;
//        System.out.println(Arrays.toString(a));
    }
}