import java.util.Arrays;

public class Functions {

    public static int myInt = 3;

    private static double myDouble = 8.498673496;

    // public -> access modifier
    public static void main(String[] args) {
        var myReturnedString = Functions.noParams();
        Functions.oneParam(myReturnedString);

        int[] ints = {1, 2, 3};
        Functions.add2(ints);
        System.out.println(Arrays.toString(ints));

        var myInt = 7;
        Functions.add2(myInt);
        System.out.println(myInt);
    }

    private static void add2(int myInt) {
        myInt += 2;
        System.out.println(myInt);
    }

    private static int add2(short myShort) {

        return 0;
    }

        // private -> access modifier
    private static void add2(int[] ints) {
        int[] myNewArray = new int[ints.length];
        for (var i = 0; i < ints.length; ++i) {
            myNewArray[i] = ints[i] + 2;
        }
        ints = myNewArray;
    }

    private static String noParams() {
        return "I am in the no params function! :/!";
    }

    private static void oneParam(String string) {
        System.out.println(string);
    }

}