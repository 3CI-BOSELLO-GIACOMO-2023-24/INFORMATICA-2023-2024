/*
 * Inserire due numeri interi da tastiera: n (n>2), val. Il programma a questo punto deve chiedere all’utente 
 * di inserire n valori interi e verificare quanti di questi sono maggiori di val e quanti sono minori di val.
 */
import javax.swing.*;
public class Maggiore_o_minore{
    public static void main (String[] args){
        int n = 0;
        int numeriuguali = 0;
        int numeriminori = 0;
        int numerimaggiori = 0;
        int val = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il valore di base: "));
        
        for(int i = n; i <= 1; i--){
            
              do{
                 n = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero maggiore di 2: "));
            }while(n < 2);
            
            if(n > val){
                numerimaggiori++;
                
            }else if(n < val){
                numeriminori ++;
                
            }else{
                numeriuguali++;
            }
        }
        
        System.out.println("I numeri maggiori sono: "+numerimaggiori+"\n i numeri minori sono"+numeriminori+"\n i numeri uguali sono: "+numeriuguali);
    }
}
