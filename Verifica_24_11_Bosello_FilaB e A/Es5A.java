
/**
 * Due numeri sono amici quando ciascuno di essi è uguale alla somma dei divisori propri
   dell'altro. Leggere due numeri e dire se sono amici. Verificare che 220 e 284 sono amici.
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
public class Es5A{
    public static void main (String [] args){
        
        int n1 = 284;
        int n2 = 220;
        int sommadivisori = 0;
        int i = 284;
        int n1ridotto = n1;
        n1ridotto--;
        int provadivisori = n1ridotto;
        
        
        while(i > 0){
            
            if(n1 % provadivisori == 0){
                sommadivisori = sommadivisori + provadivisori;
                
            }
            provadivisori= n1ridotto--;
            i--;
        }
        
        if(sommadivisori == n2){
            
            System.out.println("I due numeri sono amici");
            
        }else{
            System.out.println("I due numeri non sono amici");
        }
    }
}
