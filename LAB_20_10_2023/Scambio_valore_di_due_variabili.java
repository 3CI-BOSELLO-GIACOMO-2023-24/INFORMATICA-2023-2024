//Autore: Giacomo Bosello
import javax.swing.*;
public class Scambio_valore_di_due_variabili{
    public static void main(String [] args){
        //Prendo in input i due valori
        int a = Integer.parseInt(JOptionPane.showInputDialog("Dammi il valore di a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Dammi il valore di b: "));
        //Creo due variabili in cui salvare i valori di a e b per poi scambiarli
        int c, d;
        c = a;
        d = b;
        a = d;
        b = c;
        //Stampo le due variabili
        System.out.println("Il valore di a è: " +a);
        System.out.println("Il valore di b è: " +b);
    }
}
