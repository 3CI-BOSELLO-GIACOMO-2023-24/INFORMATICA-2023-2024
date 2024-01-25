/*
 * Dato un indirizzo email, estrarre il dominio, cioè tutto ciò che segue il simbolo @
 * ( mross@ studenti.marconiverona.edu.it → studenti.marconiverona.edu.it )
 */
import javax.swing.*;
public class Es6{
    public static void main (String[] args){
        
        
        String Email = JOptionPane.showInputDialog("Inserisci la tua email");    
        
        char c1;
        
        String Dominio = "";
        
        for(int i = 0; i < Email.length(); i++){
            
            c1 = Email.charAt(i);
            
            String Conversione = Character.toString(c1);
            
            if(Conversione.equals("@")){
                
                Dominio = Email.substring(Email.indexOf("@")+1);
                
                i = Email.length() +1;
                
            }
            
        }
        
        System.out.println("Il dominio è: "+Dominio);
        
    }
}

