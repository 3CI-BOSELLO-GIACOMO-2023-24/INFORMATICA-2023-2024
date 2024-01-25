// Contare da quante parole è composta una stringa.
import javax.swing.*;
public class Es4{
    public static void main(String[] args){
        
        String Parola = JOptionPane.showInputDialog("Inserisci una frase");
        int numeroparole = 0;
        
        for(int i = 0; i <= Parola.length()-1; i++){
            
            char lettera = Parola.charAt(i);
            String Conversione = Character.toString(lettera);
            
             if(Conversione.equals(" ")){
                
                numeroparole++;
                
            }
            
        }
        
        numeroparole = numeroparole+1;
        
        System.out.println("La frase inserita è composta da: "+numeroparole+" parole");
        
    }
}
