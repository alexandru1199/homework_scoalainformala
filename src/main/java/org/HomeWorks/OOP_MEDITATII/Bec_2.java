package org.HomeWorks.oop_meditatii;;

public class Bec_2 extends Bec {
    public Bec_2 (float pret, float voltajMaxim,float voltaj,boolean on){
       super( pret, voltajMaxim, voltaj,on);
    }
    public void GetPret(){
        super.GetPret();
        System.out.println("DA");
    }
}
