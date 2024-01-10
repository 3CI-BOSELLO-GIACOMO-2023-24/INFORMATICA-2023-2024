import javax.swing.*;
public class Es3{
    public static void main (String[] args){
        
        int fbn, somma = 0, fb1 = 1, i, fb0 = 0;
        
        do{
            
            fbn = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero maggiore di 0:"));
            
            if(fbn <= 0){
                System.out.println("Il numero inserito non è maggiore di 0");
            }
                
            
        }while(fbn <= 0);
        
        
        for(i = fbn; i >= 1; i--){
            
             somma = fb0 + fb1;
             fb0 = fb1;
             fb1 = somma;
             
             
        }
        
        System.out.println("Il risultato è: "+somma);
        
        
    }
}
