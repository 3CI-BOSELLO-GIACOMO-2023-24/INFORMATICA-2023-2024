//Autore: Giacomo Bosello
import javax.swing.*;
public class Prodotto_tra_tre_numeri{
    public static void main(String[] args){
        //Prendere in ingresso i 3 valori da moltiplicare
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il primo numero intero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il secondo numero intero: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il terzo numero intero: "));
        //Calcolo prodotto
        int prodotto = (n1*n2*n3);
        //Stampa del risultato
        System.out.println("Il risultato del prodotto è: " +prodotto);
    }
}

