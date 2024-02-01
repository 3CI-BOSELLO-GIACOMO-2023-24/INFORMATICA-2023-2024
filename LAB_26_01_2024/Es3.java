/*
 * Leggere un vettore di l valori interi, vedi esercizio 1, leggere un valore intero k 
 * e dire se il valore è presente nel vettore 
 * 
 */
import javax.swing.*;
public class Es3{
    public static void main(String[] args){
        
        int v[];
        int l = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti valori vuoi inserire"));
        v = new int[l];
        boolean risultato = false;
        int controllo;
        
        for(int i = 0; i <= l-1; i++){
            
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci i valori"));
            
        }
        
        int k = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un valore"));
        
        for(int i = 0; i <= l-1; i++){
            
            controllo = v[i];
            if(k == controllo){
                risultato = true;
                i = l+1;
            }else{
                risultato = false;
            }
            
        }
        
        if(risultato == true){
            System.out.println("Il valore inserito è contenuto nell'array");
        }else{
            System.out.println("Il valore inserito non è contenuto nell'array");
        }
    }
}
