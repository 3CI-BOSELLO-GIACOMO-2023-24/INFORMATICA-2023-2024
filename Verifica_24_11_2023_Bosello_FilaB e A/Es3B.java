
/**
 * Letti n  numeri double (2<n<=10), restituirne il prodotto dei valori positivi.
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Es3B{
    public static void main (String[] args){
        
        int numeri, n, volte,prodotto = 1;
        
        numeri = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti numeri vuoi moltiplicare"));
        
        for(volte = 0;volte < numeri;volte++){
            
            do{
                
                n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero"));
                
            }while(n < 0);
            
            prodotto = prodotto * n;
            
            
        }
        
        System.out.println("Il risultato è: "+prodotto);
        
    }
}
