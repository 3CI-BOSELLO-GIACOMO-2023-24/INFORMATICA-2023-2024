/**
 * calcolare la media dei voti di uno studente e dire se è promosso o bocciato
 * 
 * @author Giacomo Bosello
 * @version 1.0
 */
import javax.swing.*;
public class Promosso_o_bocciato{
    public static void main(String [] args){
        double nvoti, voto, volte, somma = 0, media;
        
        do{
             nvoti = Double.parseDouble(JOptionPane.showInputDialog("Inserisci di quanti voti vuoi calcolare la media: non meno di 3 e non più di 20"));
        
        }while ((nvoti < 3) || (nvoti > 20));
        
        for(volte = 0; volte < nvoti; ++volte){
            
            do{
                 voto = Double.parseDouble(JOptionPane.showInputDialog("Inserisci il voto"));
                
            }while(voto < 3 || voto > 10);
            
            somma = somma + voto;
        }
        
        media = somma / nvoti;
        
        System.out.println("La tua media è: "+media);
        
        if (media >= 6){
            System.out.println("Promosso");
        }else{
            System.out.println("Bocciato");
        }
    
    }
}