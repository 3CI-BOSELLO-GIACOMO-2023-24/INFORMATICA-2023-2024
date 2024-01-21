
/**
 * Visualizzare l’ultima cifra di un numero inserito se dispari.
 * 
 * @author Giacomo Bosello
 * @version 1.0
 */
import javax.swing.*;
public class Es2B{
    public static void main(String[] args){
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("inserisci un numero"));
        int ultimacifra = n % 10;
        
        if(n % 2 != 0){
            System.out.println(ultimacifra);
        }
        
    }
}
        
    
    
    