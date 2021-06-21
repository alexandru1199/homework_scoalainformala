package org.example;

public class Factorial {
    public static double factorial(int number){
       long  p=1;
        for(int i=2;i<=number;i++){
            p=p*i;
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(factorial( 1) );
    }
}
