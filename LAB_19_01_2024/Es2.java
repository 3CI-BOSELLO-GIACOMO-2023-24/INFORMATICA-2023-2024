//Presa una stringa, separare ogni carattere con un trattino. (ciao → c-i-a-o)
import javax.swing.*;
public class Es2{
    public static void main (String[] args){
        
        String S1 = JOptionPane.showInputDialog("Inserisci uina parola");
        
        for(int i = 0; i < S1.length(); i++){
            int c = 0;
            while(c <= i){
                
                System.out.print(S1.charAt(i));
                c++;
            }
        }
        
    }
}
