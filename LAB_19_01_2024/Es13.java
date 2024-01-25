//Prese due parole, dire quale delle due ha più vocali.
import javax.swing.*;
public class Es13{
    public static void main(String[] args){
        
        String S1 = JOptionPane.showInputDialog("Inserisci una parola");
        String S2 = JOptionPane.showInputDialog("Inserisci una parola");
        int parola1 = 0;
        int parola2 = 0;
        
        for(int i = 0; i <= S1.length()-1; i++){
            
            char lettera1 = S1.charAt(i);
            String Conversione1 = Character.toString(lettera1);
            
            if(Conversione1.equals("a") || Conversione1.equals("e") || Conversione1.equals("i") || Conversione1.equals("o") || Conversione1.equals("u") ){
                
                parola1++;
                
            }
            
        }
        
        for(int i = 0; i <= S2.length()-1; i++){
            
            char lettera2 = S2.charAt(i);
            String Conversione2 = Character.toString(lettera2);
            
            if(Conversione2.equals("a") || Conversione2.equals("e") || Conversione2.equals("i") || Conversione2.equals("o") || Conversione2.equals("u") ){
                
                parola2++;
                
            }
            
        }
        
        if(parola1 > parola2){
            
            System.out.println("La parola che contiene più vocali è: "+S1);
            
        }else{
            
            System.out.println("La parola che contiene più vocali è: "+S2);
            
        }
    }
}
