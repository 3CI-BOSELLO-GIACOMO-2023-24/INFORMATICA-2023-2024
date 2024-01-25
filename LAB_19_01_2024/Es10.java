// Scrivere un programma che realizzi la r moscia: in una stringa, sostituire tutte le ‘r’ con ‘v’.
import javax.swing.*;
public class Es10{
    public static void main (String[] args){
        String s1 = JOptionPane.showInputDialog("Inserisci una parola");
        
        for(int i = 0; i <= s1.length()-1; i++){
            
            char lettera = s1.charAt(i);
            String Conversione = Character.toString(lettera);
            if(Conversione.equals("r")){
                
                System.out.print("v");
                
            }else{
                
                System.out.print(Conversione);
            
            }
            
        }
    }
}
