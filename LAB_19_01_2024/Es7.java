//Trasformare una stringa in modo che abbia l’iniziale maiuscola e tutte le altre lettere minuscole.
import javax.swing.*;
public class Es7{
    public static void main(String[] args){
        
        String S1 = JOptionPane.showInputDialog("Scrivi una parola: ");
        char iniziale = S1.charAt(0);
        String Iniziale = Character.toString(iniziale);
        String Maiuscola = Iniziale.toUpperCase();
        String Parola = S1.substring(1);
        String Parola_minuscola = Parola.toLowerCase();
        
        System.out.println(Maiuscola+Parola_minuscola);
        
    }
}
