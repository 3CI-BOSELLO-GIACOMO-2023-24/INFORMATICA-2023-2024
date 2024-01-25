/**
 * Stampare i multipli di 3 tra 1 e n inserito dall’utente, n>3;
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Es4A{
    public static void main (String [] args){
        
        int utente;
        
        do{
            
            utente = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero"));
            
        }while(utente <= 3);
        
        while(utente > 3){
           if(utente % 3 == 0){
                System.out.println((utente)+" è un multiplo di 3");
                
            }
            utente--;
        }
        
            
        
        
    }
}

