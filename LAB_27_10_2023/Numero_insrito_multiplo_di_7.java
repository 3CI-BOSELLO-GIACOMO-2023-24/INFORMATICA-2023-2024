import javax.swing.*;
public class Numero_insrito_multiplo_di_7{
    public static void main(String [] args){
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero : "));
        
        if ((x%7)==0){
            System.out.println("Questo numero è un multiplo di 7");
        }else{
            System.out.println("Questo numero non è multiplo di 7");
        }
        
    }
}