/*
 * Leggere due vettori di interi e creare il vettore somma 
 * es.
 * v1 -> 2 3 4 5 6
 * v2 -> 1 2 1 2 3
 * vs -> 3 5 5 7 9
 */
import javax.swing.*;
public class Es1{
    public static void main(String[] args){
        
        int v1[], v2[], vs[];
        int l;
        
        l = Integer.parseInt(JOptionPane.showInputDialog("Quanti valori vuoi inserire"));
        
        v1 = new int[l];
        v2 = new int[l];
        vs = new int[l];
        
        for(int i = 0; i < l; i++){
            
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero "));
            System.out.print(v1[i]+" ");
            
        }
        System.out.print("\n");
          for(int i = 0; i < l; i++){
            
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero "));
            System.out.print(v2[i]+" ");
            
        }
        System.out.print("\n ");
        for(int i = 0; i < l; i++){
            
            vs[i] = v1[i] + v2[i];
            System.out.print(vs[i]+" ");
            
        }
        
    }
}    