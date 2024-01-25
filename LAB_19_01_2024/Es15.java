/*
 * Letti una stringa e un carattere, dire qual è la prima posizione della stringa in cui compare
 * quel carattere. Se esso non c’è, restituire -1.
 */
import javax.swing.*;
public class Es15{
    public static void main(String[] args){
        
        String Parola = JOptionPane.showInputDialog("Inserisci una parola");
        String Carattere = JOptionPane.showInputDialog("Inserisci un carattere");
        boolean presenza_carattere = false;
        
        for(int i = 0; i <= Parola.length()-1; i++){
            
            char lettera = Parola.charAt(i);
            String Conversione = Character.toString(lettera);
            
             if(Conversione.equals(Carattere)){
                
                System.out.println(Parola.indexOf(Conversione));
                presenza_carattere = true;
                i = Parola.length()+1;
            }else{
                presenza_carattere = false;
            }
            
        }
        
        if(presenza_carattere == false){
            System.out.println("-1");
        }
        
    }
}