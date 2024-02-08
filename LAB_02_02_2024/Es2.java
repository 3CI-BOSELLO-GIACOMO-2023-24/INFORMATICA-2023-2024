/*
 * Implementare un programma che lette tre stringhe realizza una stringa 
 * prendendo una parola dalla prima, una dalla seconda e 
 * una dalla terza alternativamente
 */
import javax.swing.*;
public class Es2{
    public static void main(String[] args){
        
        String s1 = JOptionPane.showInputDialog("Inserisci una frase");
        String s2 = JOptionPane.showInputDialog("Inserisci una frase");
        String s3 = JOptionPane.showInputDialog("Inserisci una frase");
        String Sfinale ="";
        
        
        for(int i = 0; i < s1.length(); i++){
            
            char carattere;
            carattere = s1.charAt(i);
            String Conversione = Character.toString(carattere);
            if(Conversione.equals(" ")){
                i = s1.length();
            }
            Sfinale = Sfinale + Conversione;    
            
        }
        
        for(int i = 0; i < s2.length(); i++){
            
            char carattere;
            carattere = s2.charAt(i);
            String Conversione = Character.toString(carattere);
            if(Conversione.equals(" ")){
                i = s2.length();
            }
            Sfinale = Sfinale + Conversione;
            
        }
        
        for(int i = 0; i < s3.length(); i++){
            
            char carattere;
            carattere = s3.charAt(i);
            String Conversione = Character.toString(carattere);
            if(Conversione.equals(" ")){
                i = s3.length();
            }
            Sfinale = Sfinale + Conversione;
            
        }
        
        System.out.println(Sfinale);
    }
}    
