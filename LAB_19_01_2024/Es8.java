//Scrivere un programma per invertire una stringa.
import javax.swing.*;
public class Es8{
    public static void main(String[] arsg){
        
        String S1 = JOptionPane.showInputDialog("Scrivi una parola: ");
        
        for(int i = S1.length()-1; i >= 0; i--){
            
            System.out.print(S1.charAt(i));
            
        }
    }
}
