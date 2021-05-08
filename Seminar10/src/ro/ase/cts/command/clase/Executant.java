package ro.ase.cts.command.clase;
 //cont bancar
public class Executant {
    private String detinator;
    private float sold;

     public Executant(String detinator) {
         this.detinator = detinator;
     }

     public void constituire(float suma){
         this.sold = suma;
         System.out.println("S-a constituit contul cu suma" +this.sold);
     }
     public void depunere(float suma){
         this.sold += suma;
         System.out.println("Sha efectuat o depunere cu suma "+suma);
     }
     public void retragere(float suma){
         if(suma<this.sold){
             this.sold -= suma;
             System.out.println("S-a efectuat o retragere cu suma "+suma);
         }
         else
             System.out.println("Fonduri insuficiente");
     }
 }
