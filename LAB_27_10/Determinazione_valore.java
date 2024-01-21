import javax.swing.*;
public class Determinazione_valore{
    public static void main(String[] args){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci un numero intero"));
        if (a == 0){
            System.out.println("Il valore è nullo");
        }else if (a > 0){
            System.out.println("Il valore è positivo");
        }else if (a < 0){
            System.out.println("Il valore è negativo");
        }
    }
}
