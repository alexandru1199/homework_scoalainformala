package org.example;
import java.lang.*;
import java.util.*;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Inaltimea este: ");
        float inaltime = input.nextFloat();
        System.out.println("Greutatea este: ");
        float masa= input.nextFloat();
        System.out.println("Indicele de greutate este: "+ masa/inaltime/inaltime);
        float a=masa/inaltime/inaltime;
        if(a>=18.5&&a<=24.9){
            System.out.println("sanatoas(a)");
        }
        else if(a>=25.0&&a<=29.9){
            System.out.println("supraponderal");
        }
        else if(a>=30.0&&a<=34.9){
            System.out.println("obezitate grd. I");
        }
        else if(a>=35.0&&a<=39.9){
            System.out.println("obezitate grd. II");
        }
        else if(a>=40){
            System.out.println("obezitate morbida");
        }
        else{
            System.out.println("Indice de greutate invalid");
        }


    }
}