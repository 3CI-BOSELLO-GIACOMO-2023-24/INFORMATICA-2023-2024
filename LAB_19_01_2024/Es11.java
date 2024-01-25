//Scrivere un programma che, letta una parola, sostituisca tutte le vocali con un asterisco.
import javax.swing.*;
public class Es11{
    public static void main(String[] args){
        String s1 = JOptionPane.showInputDialog("Inserisci una parola");
        
        for(int i = 0; i <= s1.length()-1; i++){
            
            char lettera = s1.charAt(i);
            String Conversione = Character.toString(lettera);
            if(Conversione.equals("a") || Conversione.equals("e") || Conversione.equals("i") || Conversione.equals("o") || Conversione.equals("u") ){
                
                System.out.print("*");
                
            }else{
                
                System.out.print(Conversione);
            
            }
            
        }
    }
}
