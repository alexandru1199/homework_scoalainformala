package org.example;
import java.util.Scanner;
public class t3  extends  t2{
    public static void main(String[] args) {
        int a=s.nextInt();
        if(a>0&&a<10)
            System.out.println("numarul este mai mic ca 10");
        if(a>=10&&a<=20)
            System.out.println("numarul este intre 10-20");
        if(a>30)
            System.out.println("numarul mai mare ca 30");
    }
}
