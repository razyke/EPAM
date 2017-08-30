package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Controller {

    void startCalculating() {

        System.out.println("Привет, я калькулятор, что будем деать ?");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String err = "Введите 2 целочисленных числа через пробел.";

        for (;;) {
            System.out.println("1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление, 5 - выход.");
            int choice = 0;
            try {
                choice = Integer.parseInt(bf.readLine());
            } catch (Exception e) {
                //Something to log
            }
            if (choice>5 || choice<=0)
                System.out.println("Введите корректную команду.");

            switch (choice){
                case 1 :
                    System.out.println("Сложение: введите 2 числа через пробел.");
                        try {
                            int[] array;
                            for (;;) {
                                String values = bf.readLine();
                                array = checkValueAndReturnArray(values);
                                if (array!=null && array.length==2)
                                    break;
                                else
                                    System.out.println(err);
                            }
                            new Summation().calc(array,this);
                        } catch (IOException e) {
                            //Something to log
                        }
                        break;
                case 2 :
                    System.out.println("Вычитание: введите 2 числа через пробел.");
                    try {
                        int[] array;
                        for (;;) {
                            String values = bf.readLine();
                            array = checkValueAndReturnArray(values);
                            if (array!=null && array.length==2)
                                break;
                            else
                                System.out.println(err);
                        }
                        new Subtraction().calc(array,this);
                    } catch (IOException e) {
                        //Something to log
                    }
                    break;
                case 3 :
                    System.out.println("Умножение: введите 2 числа через пробел.");
                    try {
                        int[] array;
                        for (;;) {
                            String values = bf.readLine();
                            array = checkValueAndReturnArray(values);
                            if (array!=null && array.length==2)
                                break;
                            else
                                System.out.println(err);
                        }
                        new Multiply().calc(array,this);
                    } catch (IOException e) {
                        //Something to log
                    }
                    break;
                case 4 :
                    System.out.println("Деление: введите 2 числа через пробел.");
                    try {
                        int[] array;
                        for (;;) {
                            String values = bf.readLine();
                            array = checkValueAndReturnArray(values);
                            if (array!=null && array.length==2)
                                break;
                            else
                                System.out.println(err);
                        }
                        new Divide().calc(array,this);
                    } catch (IOException e) {
                        //Something to log
                    }
                    break;
            }

            if (choice==5)
                break;
        }
    }

    private int[] checkValueAndReturnArray(String val){
        String[] vals = val.split(" ");
        int[] arr;
        try {
            arr = new int[vals.length];
            for (int i = 0; i <vals.length; i++) {
             arr[i] = Integer.parseInt(vals[i]);
            }
            return arr;
        }catch (Exception e){
            //Something to log
        }
        return null;
    }

    void printInStars(Object val){

        String[] arr = String.valueOf(val).split("");

        String [] forPrint = new String[]{"","","","",""};

        for (String s : arr){
            switch (s){
                case "1":
                    forPrint[0] +="  *  ";
                    forPrint[1] +="  *  ";
                    forPrint[2] +="  *  ";
                    forPrint[3] +="  *  ";
                    forPrint[4] +="  *  ";
                    break;
                case "2":
                    forPrint[0] +=" *** ";
                    forPrint[1] +="   * ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +=" *   ";
                    forPrint[4] +=" *** ";
                    break;
                case "3":
                    forPrint[0] +=" *** ";
                    forPrint[1] +="   * ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +="   * ";
                    forPrint[4] +=" *** ";
                    break;
                case "4":
                    forPrint[0] +=" * * ";
                    forPrint[1] +=" * * ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +="   * ";
                    forPrint[4] +="   * ";
                    break;
                case "5":
                    forPrint[0] +=" *** ";
                    forPrint[1] +=" *   ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +="   * ";
                    forPrint[4] +=" *** ";
                    break;
                case "6":
                    forPrint[0] +=" *** ";
                    forPrint[1] +=" *   ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +=" * * ";
                    forPrint[4] +=" *** ";
                    break;
                case "7":
                    forPrint[0] +=" *** ";
                    forPrint[1] +="   * ";
                    forPrint[2] +="  *  ";
                    forPrint[3] +=" *   ";
                    forPrint[4] +=" *   ";
                    break;
                case "8":
                    forPrint[0] +=" *** ";
                    forPrint[1] +=" * * ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +=" * * ";
                    forPrint[4] +=" *** ";
                    break;
                case "9":
                    forPrint[0] +=" *** ";
                    forPrint[1] +=" * * ";
                    forPrint[2] +=" *** ";
                    forPrint[3] +="   * ";
                    forPrint[4] +=" *** ";
                    break;
                case "0":
                    forPrint[0] +=" *** ";
                    forPrint[1] +=" * * ";
                    forPrint[2] +=" * * ";
                    forPrint[3] +=" * * ";
                    forPrint[4] +=" *** ";
                    break;
                case ".":
                    forPrint[0] +="  ";
                    forPrint[1] +="  ";
                    forPrint[2] +="  ";
                    forPrint[3] +="  ";
                    forPrint[4] +="# ";
                    break;
                case "-":
                    forPrint[0] +="   ";
                    forPrint[1] +="   ";
                    forPrint[2] +="---";
                    forPrint[3] +="   ";
                    forPrint[4] +="   ";
                    break;

            }
        }
        for(String x :forPrint)
            System.out.println(x);
    }
}
