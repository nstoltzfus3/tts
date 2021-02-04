public class JavaReview {

    public static void myFunction() {

    }

    public static void myCallingFunction() {
        myFunction();
    }

    public static void main(String[] args) {

        String[] stuff = {"stuff ", "Oglethorp",
                    "Stone Dwarf", "Pangolin "};
        int max = 10;
        String[] maxString = new String[max];// [null, null, null,...]

        for (int i = 0; i < stuff.length; i++) {
            // stuff[i]
        }

        for (String whatever : stuff) {
            // contains
            // True && False
            if (whatever.contains(" ")) {
                System.out.println(whatever);
            }
            // whatever
        }

        // 2 dimensional Array.
        int[][][] fun = new int[5][5][5];

        // default value for array is 0 in java.
        // System.out.println(fun[0][0]);


        for (int i = 0; i < fun.length; i++) {
            for (int j = 0; j < fun.length; j++) {
                for (int k = 0; k < fun.length; k++) {
                    //   0   1   2   3
                    //0 [0] [1] [2] [3]
                    //1 [1] [2] [3] [4]
                    //2 [2] [3] [4] [5]
                    //3 [3] [4] [5] [6]
                    fun[i][j][k] = (i+1) * (j+1) * (k+1);
                }
            }
        }











    }
}
