package org.example;

import java.util.Scanner;

public class t4 extends t2 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);

        int a = 1;
        int b = 100;
        int endloop=1;

        System.out.println(a);

        while (endloop==1) {
            System.out.println("Vreti sa opriti loopul? scrieti 1 sa continuati , scrieti 0 sa se opreasca");
            endloop=S1.nextInt();
            if (a > 0 && a < 10) {
                System.out.println(a);
            } else if (a >= 10 && a < 20) {


                System.out.println(a);
            } else if (a > 30) {


                System.out.println(a);
            }
            else{

                System.out.println(a);
            }
        }
    }
}

