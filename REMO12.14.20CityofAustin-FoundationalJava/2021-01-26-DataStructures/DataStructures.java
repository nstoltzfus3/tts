import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataStructures {

    public static void main(String[] args) {
        String[] stuff = new String[5];
        //stuff[1] = "1"
        ArrayList<String> goodbyes = new ArrayList<>();

        goodbyes.add("Arrividercci");
        goodbyes.add("siyonara");
        goodbyes.add("hasta manana");

        goodbyes.set(1, "goodbye");

        goodbyes.get(1); // goodbyes.get(1) -> siyonara

        String myString = "I really love icecream!";

//Create another string that holds the split version of the first
        String[] str = myString.split(" ");
        System.out.println(Arrays.toString(str));

    }
}
