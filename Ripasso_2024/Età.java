/*
 *  leggere in input gli anni di una persona 
 *  e dire se è maggiorenne o minorenne (se anni <0 o >120 visualizzare ERORE)
 */ 
import javax.swing.*;
public class Età{
    public static void main (String[] args){
        int età = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l'età: "));
        
        if(età > 0 || età <= 120){
            if(età >= 18){
                System.out.println("Maggiorenne");
            }else{
                System.out.println("Minorenne");
            }
        }else{
            System.out.println("ERRORE");
        }
    }
}
