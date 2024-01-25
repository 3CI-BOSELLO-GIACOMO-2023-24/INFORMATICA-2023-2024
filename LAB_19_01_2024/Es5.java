/*
 * Presi un nome ed un cognome, creare l’indirizzo email del marconi, formato dalla prima
 * lettera del nome e dalle prime quattro del cognome, seguiti da
 * @studenti.marconiverona.edu.it (mario rossi → mross@ studenti.marconiverona.edu.it )
 */
import javax.swing.*;
public class Es5{
    public static void main (String[] args){
        
        String Nome = JOptionPane.showInputDialog("Inserisci il tuo nome");
        String Cognome = JOptionPane.showInputDialog("Inserisci il tuo cognome");
        
        char nome1 = Nome.charAt(0);
        
        String Cognome1 = Cognome.substring(0,4);
        
        String Conversione = Character.toString(nome1);
        
        String Mail = Conversione + Cognome1 + "@studenti.marconiverona.edi.it";
        
        System.out.println(Mail);
    }
}

