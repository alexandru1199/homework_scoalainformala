package org.example;

import java.lang.*;
import java.util.*;

public class t1 {
    public static void hello(String nume) {
        if (nume.equals(""))
            System.out.print("Hello, stranger.");
        else {
            System.out.print("Hello, " + nume + "!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nume = input.nextLine();
        hello(nume);

    }


}

