package org.HomeWorks.oop_meditatii;

 class Main {
     public  static int suma(int a , int b){
         System.out.println(a+b);
;         return a+b;
     }
     public  static int suma(int a , int b , int c){
                System.out.println(a+b+c);
         return a+b+c;
     }
    public static void main(String[] args) {
         suma(1,4);
         suma(1,4,5);
        Bec b= new Bec(1,2,3,true);

        Bec_2 d=new Bec_2(1,2,3,true);

        b.GetPret();
        d.GetPret();
    }
}
