//Autore: Giacomo Bosello
import javax.swing.*;
public class Calcolo_area_e_circonferenza_cerchio{
    public static void main(String [] args){
        //Prendo in ingresso il vaore del raggio
        int r = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il valore del raggio: "));
        //Calcolo e stampo lunghezza circonferenza e area del cerchio
        System.out.println("Circonferenza :" +(r*6.28));
        System.out.println("Area :" +(r*r*3.14));
    
    }
}
