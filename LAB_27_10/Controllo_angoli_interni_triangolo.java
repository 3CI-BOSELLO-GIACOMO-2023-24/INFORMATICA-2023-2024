import javax.swing.*;
public class Controllo_angoli_interni_triangolo{
    public static void main (String[] args){
        float a = Float.parseFloat(JOptionPane.showInputDialog("Inserisci valore angolo 1"));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Inserisci valore angolo 2"));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Inserisci valore angolo 3"));
        
        if ((a + b + c) == 180){
             System.out.println("Misure corrette");
        }else{
            System.out.println("Misure errate");
        }
           
    }
}