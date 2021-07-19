package org.HomeWorks.homework7;

public class MyProgram {
    static String calculator(int a , int b , String c) {
        System.out.println("primu arguments args= "+a+" al doilea argument args= "+b+" al 3 lea argument args= "+c);
        switch (c){
            case "+":
                return a+b+"";

            case "-":
                return a-b+"";
            case "*":
                return a*b+"";
            case "/":
                return a/b+" ";
             default:
                return "invalid operator";

    }
    }
    public static void main(String[] args) {
        System.out.println( calculator(Integer.parseInt(args[0]),Integer.parseInt(args[1]),args[2]));
    }

}
