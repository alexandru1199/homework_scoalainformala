package org.example;

public class Calculat {

    public static int Suma(int a23 , int b45){

        return a23+b45;
    }
    public static void Calculator(int primul_Numarintreg,int alDoileaNumar,String operation){

        switch (operation) {
            case "*":
                System.out.println(primul_Numarintreg*alDoileaNumar);
                break;
            case "-":
                System.out.println(primul_Numarintreg-alDoileaNumar);
                break;
            case "+":
                System.out.println(primul_Numarintreg+alDoileaNumar);
                break;
            case "/":
                System.out.println(primul_Numarintreg/alDoileaNumar);
                break;
            default:
                System.out.println("Nu ai introdus o operatie valida");

                primul_Numarintreg = 5;

        }

    }
}