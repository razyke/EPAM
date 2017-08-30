package lesson3;

public class Divide implements Mathematics {

    public void calc(int[] args, Controller c) {

                double a = args[0];
                double b = args[1];
                double res = a / b;
                if (b==0){
                    System.out.println("INFINITY");
                    return;
                }

                if (res%1==0)
                    c.printInStars((int) res);
                else
                    c.printInStars(res);
    }

}
