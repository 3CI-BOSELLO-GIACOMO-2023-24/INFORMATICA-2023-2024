/*
 * Leggere un valore l compreso tra 3 e 10
 * Leggere un vettore di l elementi interi 
 * fare la somma di tutti i valori del vettore e visualizzare la somma
 * fare la somma di tutti i valori dispari (sommad) e visualizzare il risultato 
 * fare la somma di tutti i valori in posizione pari (sommapp) e visualizzare il risultato
 */
import javax.swing.*;
public class Es1{
    public static void main(String[] args){
        
        int v[];
        int l;
        int somma = 0;
        int sommapp = 0;
        int sommadispari = 0;
        
        do{
            
            l = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la grandezza dell'array: "));
            
        }while(l < 3 || l > 10);
        
        v = new int [l];
        
        for(int i = 0; i < l; i++ ){
            
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un valore: "));
            somma = somma + v[i];
            
        }
        
        for(int i = 0; i < l; i++ ){
            
            if(v[i] % 2 != 0){
                
               sommadispari = sommadispari + v[i]; 
                
            }
            
        }
        
        for(int i = 0; i < l; i++ ){
            
            if(i % 2 == 0){
                
                sommapp = sommapp + v[i];
                
            }
            
        }
        
        System.out.println("La somma di tutti i valori è: "+ somma);
        System.out.println("La somma dei valori dispari è: "+ sommadispari);
        System.out.println("La somma dei valori in posizione pari è: "+sommapp);
    }
}
