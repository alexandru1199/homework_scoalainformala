package org.HomeWorks.homeowork6;

public class VatCalculator {
    static void calculatePrice(float baseprice, float VAT)
    {
        System.out.println(baseprice+baseprice*VAT/100);
    }
    public static void main(String[] args) {
         calculatePrice(13,20);
    }
}
