import javax.swing.*;
public class Pari_o_dispari{
    public static void main(String[] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero : "));
        if ((x%2)==0){
            
            System.out.println("Il numero è pari");
            
        }else{
            System.out.println("Il numero è dispari");
        }
    }
}
