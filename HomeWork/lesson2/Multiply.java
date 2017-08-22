package lesson2;

public class Multiply {
    public static void main(String[] args) {
        if (args.length!=2)
            System.out.println("Please write 2 variables");
        else {
            try {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                System.out.println("Multiply: "+a+" * "+b+" = "+ (a*b));
            }catch (Exception e){
                System.out.println("Please write 2 integer values");
            }
        }
    }
}
