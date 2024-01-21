/*
 * Calcolare il prodotto tra due valori interi letti in input val1, val2 per somme successive
 */
import javax.swing.*;
public class Somme_successive{
    public static void main (String[] args){
       
        
       int val1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero: "));
       int val2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero: "));
       int copia_val2 = val2;
       int somma = 0;
       
       for(int i = val2; i <= 1; i--){
           somma = val2 + somma;    
       }
    }
}
