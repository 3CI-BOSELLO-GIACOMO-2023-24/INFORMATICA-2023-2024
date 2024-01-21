/**
 * Calcolare e visualizzare  il prodotto di n valori interi
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Prodotto_tra_valori{
    public static void main(String[] args){
        
        int tnumeri, n, prodotto = 1,volte;
        
        tnumeri = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti numeri vuoi moltiplicare"));
        
        for (volte = 0; volte < tnumeri; volte++){
             n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il numero"));
             prodotto = prodotto * n;
        }
            
        System.out.println("Il prodotto dei numeri è: "+prodotto);
           
            
        }
    }
    



