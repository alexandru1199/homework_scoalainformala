package org.HomeWorks.oop_meditatii;

 class Bec {
   protected float pret;
   private float voltajMaxim;
   private float voltaj;
   private boolean on;
   float c;
   public Bec (float pret, float voltajMaxim,float voltaj,boolean on){
       this.pret=pret;
     this.voltajMaxim=voltajMaxim;
     this.on=on;
   }
   public Bec(){
       System.out.println("Constructour default");
   }
   protected void GetPret(){
       System.out.println(pret);
   }
     private void GetPret2(){
         System.out.println(pret);
     }

}
