import java.util.Arrays;
import java.util.Random;



public class DSPractice {

    public static int addStuff(int[] myArr) {
        myArr[2] = 5;
        return 5;
    }


    public static int getArraySum(int[] arr)
    {
        // initialize to a valid default return value
        int sum = 0;

        // array must have values to sum
        if (arr.length > 0)
        {
            for ( int n : arr)
            {
                System.out.println("Current sum" + sum);
                sum += n;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int breakAt = random.nextInt(100);

// print a 'list' of random length
//        for(int i=0; i<100; i++)
//        {
//            if ( i==breakAt)
//            {
//                System.out.println("Random number was: " + breakAt);
//                break;
//            }
//            System.out.println("Index: " + i);
//        }
//        System.out.println("After the loop");

//        breakAt = 99;
//        int count = 0;
//        while (true) {
//
//            if ( count==breakAt)
//            {
//                System.out.println("Random number was: " + breakAt);
//                break;
//            }
//            System.out.println("Index: " + count);
//
//            count++;
//        }
//        System.out.println("After the loop");


//        for(int x=1; x<=5; x++)
//        {
//            System.out.println("Starting list " + x);
//
//            for(int i=0; i<100; i++)
//            {
//                if ( i==breakAt)
//                {
//                    System.out.println("Length of this list: " + breakAt);
//                    break;
//                }
//                System.out.println("Index: " + i);
//            }
//            System.out.println("Finished list " + x);
//            // Get the next randome number for a different size list
//            breakAt = random.nextInt(100);
//        }
//        System.out.println("After the loop");

//        anything:
//        for(int x=1; x<=5; x++)
//        {
//            System.out.println("Starting list " + x);
//
//            for(int i=0; i<100; i++)
//            {
//                if ( i==breakAt)
//                {
//                    System.out.println("Length of this list: " + breakAt);
//
//                    if (breakAt % x == 2)
//                    {
//                        System.out.println("List generation ended early!");
//                        //labeled break
//                        break anything;
//                    }
//                    else
//                    {
//                        break;
//                    }
//                }
//                System.out.println("Index: " + i);
//            }
//            System.out.println("Finished list " + x);
//            // Get the next random number for a different size list
//            breakAt = random.nextInt(100);
//        }
//        System.out.println("After the loop");

//        for(int i=0; i<100; i++)
//        {
//            if ( i==breakAt)
//            {
//                System.out.println("Random number was: " + breakAt);
//                break;
//            }
//            // if number is even, skip to next iteration
//            if ( i%2==0)
//            {
//                continue;
//            }
//            System.out.println("Index: " + i);
//        }
//        System.out.println("After the loop");


        outer:
        for(int i=0; i<5; i++)
        {
            System.out.println("List number: " + i);
            for(int y=0; y<25; y++)
            {
                System.out.println("Index: " + y);
                if ( y == 12)
                {
                    continue outer;
                }
            }
        }
//        int[] myArr = {1,2,3,4,5};
//        addStuff(myArr);
//        for (int i : myArr) {
//            System.out.print(i);
//        }
//
////        System.out.println("Final sum result: " + getArraySum(myArr));
//        String poem = "chim";
//        int count = 0;
//        while (true) {
//            System.out.println(poem);
//            switch(poem) {
//                case "chim":
//                    if (count == 2) {
//                        poem = "chim";
//                    } else if (count == 3) {
//                        poem = "churree";
//                    }
//                    poem = "chiminey";
//                    count ++;
//                    break;
//                case "chiminey":
//                    poem = "chim";
//                    break;
//                case "churree":
//                    poem = "a sweep is as lucky as lucky can be.";
//            }
//
//        }

        // normal for loop
//        int[] myArr1 = {1,100,5,4,5,6,7,8};
        String[] myArr2 = {"Sup", "Hallo", "Konichiwa", "Ni hao"};
        // [1] = 2
        // [0] = 1
        for (int i = 0; i < myArr2.length; i++) { // 0,1,2,3,4,5,6,7
            System.out.println(myArr2[i]);
            Arrays.stream(myArr2).sorted();
            //  myArr1[0] = 1
            //  myArr1[1] = 100
        }

        for (String num : myArr2) { // 1, 100, 5, 6 -> 8
            System.out.println(num);
        }

    }

}
