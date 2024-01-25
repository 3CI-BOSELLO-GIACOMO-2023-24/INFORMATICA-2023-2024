
/**
 * Calcolare il prodotto di due valori interi e positivi utilizzando la sommatoria
 * 
 * @author Giacomo Bosello 
 * @version (un numero di versione o una data)1.0
 */
import javax.swing.*;
public class Sommatoria{
    public static void main(String[] args){
        int n, volte, somma, prodotto, risultato = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero"));
        prodotto = Integer.parseInt(JOptionPane.showInputDialog("Scrivi per quanto vuoi moltiplicare questo numero"));
        
        for(volte = 0; volte < prodotto; volte++){
        
            risultato = n + risultato;    
            
        }
        
        System.out.println("Il risultato è: "+risultato);
    }
}