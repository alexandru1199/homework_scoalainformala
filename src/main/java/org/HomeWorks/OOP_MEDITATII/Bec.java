package org.HomeWorks.OOP_MEDITATII;

 class Bec {
   private float pret;
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

}
