/*
 * Scrivere un programma che, letta una parola, ne restituisca un'altra data da tutte le lettere
 * in posizione pari seguite da tutte le lettere in posizione dispari della prima parola.
 */ 
import javax.swing.*;
public class Es12{
    public static void main(String[] args){
        String s1 = JOptionPane.showInputDialog("Inserisci una parola");
        
        for(int i = 0; i <= s1.length()-1; i++){
            
            char lettera = s1.charAt(i);
            String Conversione = Character.toString(lettera);
            if(i % 2 == 0){
                
                System.out.print(Conversione);
                
            }
            
        }
        System.out.print(" ");
        for(int i = 0; i <= s1.length()-1; i++){
            
            char lettera = s1.charAt(i);
            String Conversione = Character.toString(lettera);
            if(i % 2 != 0){
                
                System.out.print(Conversione);
                
            }
            
        }
    }
}
