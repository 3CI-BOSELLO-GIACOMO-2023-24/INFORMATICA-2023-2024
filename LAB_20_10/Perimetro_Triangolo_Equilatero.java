//Autore: Giacomo Bosello
import javax.swing.*;
public class Perimetro_Triangolo_Equilatero{
    public static void main(String [] args){
        //Prendo in ingresso il valore del lato
        int lato = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il lato del triangolo equilatero: "));
        //Calcolo l'area del triangolo
        int perimetro = lato*3;
        //Stampo il risultato
        System.out.println("Il perimetro è: " +perimetro);
        
    }
}
