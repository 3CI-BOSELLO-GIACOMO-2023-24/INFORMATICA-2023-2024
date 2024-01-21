import javax.swing.*;
public class Area_e_circonferenza_triangolo{
    public static void main(String [] args){
        //Prendo in ingresso il vaore del raggio
        float r = Float.parseFloat(JOptionPane.showInputDialog("Inserisci il valore del raggio: "));
        //Controllo che il valor sia positivo
        if(r > 0){
            //Calcolo lunghezza circonferenza
            float circonferenza = r*2*3.14f;
            //Calcolo l'area
            float area = r*r*3.14f;
            System.out.println("La circonferenza vale: " +circonferenza+ " L'area vale: " +area);
        }else{
            System.out.println("Errore");
        }
    }
}
