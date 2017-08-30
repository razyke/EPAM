package lesson3;

public class Subtraction implements Mathematics {

    public void calc(int[] args, Controller c) {

        int a = args[0];
        int b = args[1];
        int result = a-b;
        c.printInStars(result);
    }
}