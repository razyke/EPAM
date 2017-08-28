package lesson3;

public class Divide {

    public static void div(int[] args) {

                double a = args[0];
                double b = args[1];
                double res = a / b;
                if (b==0){
                    System.out.println("INFINITY");
                    return;
                }

                if (res%1==0)
                    Controller.printInStars((int) res);
                else
                    Controller.printInStars(res);
    }

}
