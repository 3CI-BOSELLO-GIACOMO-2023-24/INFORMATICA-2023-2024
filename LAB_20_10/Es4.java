//Autore: Giacomo Bosello
import javax.swing.*;
public class Es4{
    public static void main(String [] args){
        //Prende in ingresso ore, minuti e secondi
        int ore = Integer.parseInt(JOptionPane.showInputDialog("Inserisci le ore;: "));
        int minuti = Integer.parseInt(JOptionPane.showInputDialog("Inserisci i minuti:"));
        int secondi = Integer.parseInt(JOptionPane.showInputDialog("Inserisci i secondi: "));
        //Trasforma tutti i valori in secondi, faccio la somma e assegno il risultato ad una nuova variabile
        int totsecondi = ore*3600 + minuti*60 + secondi;
        //Stampa il risultato
        System.out.println("In totale sono :"+totsecondi+ "secondi");
    }
}