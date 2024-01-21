/*
 *  Scrivere un programma che stampi a video tutti i 
 *  numeri pari compresi tra due estremi a e b letti da tastiera. Il programma deve dire anche quanti sono.
 */
import javax.swing.*;
public class Tot_numeri_pari{
    public static void main(String[] args){
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero: "));
        int maggiore = Math.max(a,b);
        int minore = Math.min(a,b);
        int c = 0;
        
        for(int i = minore;i <= maggiore; i++){
            if(i % 2 == 0){
                System.out.println(i);
                c++;
            }
                
            
        }
        
        System.out.println("In totale ci sono "+c+" numeri pari in questo intervallo");
    }
}
