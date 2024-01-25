
/**
 * Letti n  numeri interi (3<n<14) , calcolare la somma dei valori pari.
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Es2A{
    public static void main(String[] args){
        System.out.println("Il numero noon deve essere minore di 3 o maggiore di 14");
        int tot = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti numeri vuoi sommare"));
        int n;
        int somma = 0;
        for(int i = 0; i < tot; i++){
            
            
            do{  
                n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero"));
            }while(n <= 3 || n >= 14);
            
            if(n % 2 == 0){
                somma = somma + n;
            }
        
        }
        
        System.out.println("Il risultato è: "+somma);
        
        
        
        
    }
}


