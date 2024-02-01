/*
 * Leggere un valore l compreso tra 3 e 10
 * leggere un vettore di l valori double corrispondenti ai voti di un alunno (voto compreso tra 3 e 10)
 * calcolare e visualizzare la media dei voti
 * dire se l'alunno è promosso o bocciato
 * visualizzare il voto più basso e il voto più alto
 */
import javax.swing.*;
public class Es2{
    public static void main(String[] args){
        
        double v[];
        int l;
        double media = 0.0;
        double max = 0;
        double min = 0;
        int c = 0;
        
        do{
            
            l = Integer.parseInt(JOptionPane.showInputDialog("Inserisci quanti voti ha l'alunno: "));
            
        }while(l < 3.0 || l > 10.0);
        
        v = new double [l];
        
        for(int i = 0; i < l; i++){
                
            do{
                
                v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserisci un voto: "));
                
            }while(v[i] < 3.0 || v[i] > 10.0 );
                
        }
        
        for(int i = 0; i < l; i++){
            
            media = media + v[i];
            
        }
        media = media / l;
        
        if(media >= 6.0){
            System.out.println("Promosso");
        }else{
            System.out.println("Bocciato");
        }
        
        
        for(int i = 1; i < l; i++){
            
            max = Math.max(v[i],v[c]);
            
             if(v[c] < v[i]){
                c = i;
            }
            
        }
        
        c = 0;
        
        for(int i = 1; i < l; i++){
            
            min = Math.min(v[c],v[i]);
            
            if(v[c] > v[i]){
                c = i;
            }
            
        }
        
        System.out.println("La media dello studente è: "+media);
        System.out.println("Il voto più alto dello studente è: "+max);
        System.out.println("Il voto più basso dello studente è: "+min);
        
    }
}
