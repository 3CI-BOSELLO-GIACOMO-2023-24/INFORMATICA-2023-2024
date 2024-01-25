//Scrivere un programma per eliminare la lettera ‘a’ da una stringa.
import javax.swing.*;
public class Es9{
    public static void main(String[] args){
        
        String s1 = JOptionPane.showInputDialog("Inserisci una parola");
        
        for(int i = 0; i <= s1.length()-1; i++){
            
            char lettera = s1.charAt(i);
            String Conversione = Character.toString(lettera);
            if(Conversione.equals("a")){
                
                System.out.print("");
                
            }else{
                
                System.out.print(Conversione);
            
            }
            
        }
        
    }
}
