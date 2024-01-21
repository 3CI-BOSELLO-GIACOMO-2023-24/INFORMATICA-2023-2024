// Il programma legge due numeri e controlla se il il maggiore è multiplo del minore.
import javax.swing.*;
public class Calcolo_multiplo{
    public static void main(String[] args){
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero: "));
        int maggiore;
        int minore;
        
        maggiore = Math.max(n1,n2);
        minore = Math.min(n1,n2);
        
        if(maggiore % minore == 0){
            System.out.println("Il numero maggiore è multiplo del numero minore");
        }else{
            System.out.println("Il numero maggiore non è multiplo del numero minore");
        }
    }
}
