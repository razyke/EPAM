package lesson2;

public class Divide {
    public static void main(String[] args) {
        if (args.length!=2)
            System.out.println("Please write 2 variables");
        else {
            try {
                double a = Integer.parseInt(args[0]);
                double b = Integer.parseInt(args[1]);
                double res = a/b;
                System.out.println("Divide: "+(int)a+" : "+(int)b+" = "+ (res%1==0? ((int)res) : res+""));
            }catch (Exception e){
                System.out.println("Please write 2 integer values");
            }
        }
    }
}
