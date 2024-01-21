
/**
 * Letta una temperatura dire se c’è freddo (<10) fresco(tra 10 e minore di 20) caldo(tra 20 e 29) molto caldo (più di 29) . 
 * La temperatura non deve essere minore di -50 e maggiore di 50.
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Es1B{
    public static void main(String[] args){
        
        int temperatura;
        
        do{
             System.out.println("La temperatura non può essere maggiore di 50 o minore di -50");   
             temperatura = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la temperatura"));
        }while(temperatura > 50 || temperatura < -50);    
        
        if(temperatura < 10){
            System.out.println("C'è freddo");
        
        }else if(temperatura >= 10 && temperatura < 20){
            
             System.out.println("C'è fresco");
        }else if(temperatura >= 20 && temperatura <= 29){
            
             System.out.println("C'è caldo");
        }else if(temperatura > 29){
            
             System.out.println("C'è molto caldo");
        }
        
    
    
    }
}

