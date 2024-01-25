//Letti una stringa e un carattere, dire se quella stringa contiene quel carattere.
import javax.swing.*;
public class Es14{
    public static void main(String[] args){
        
        String Parola = JOptionPane.showInputDialog("Inserisci una parola");
        String Carattere = JOptionPane.showInputDialog("Inserisci un carattere");
        
        
        for(int i = 0; i <= Parola.length()-1; i++){
            
            char lettera = Parola.charAt(i);
            String Conversione = Character.toString(lettera);
            
             if(Conversione.equals(Carattere)){
                
                System.out.println("La parola inserita contiene il carattere: "+Carattere);
                i = Parola.length()+1;
            }
            
        }
    }
}
