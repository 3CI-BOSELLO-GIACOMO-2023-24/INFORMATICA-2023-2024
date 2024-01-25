/*
 * Presa una stringa, modificarla in modo che il primo carattere sia ripetuto una volta, il
 * secondo due, il terzo tre, e così via. (ciao → ciiaaaoooo)
 */
public class Es3{
    public static void main (String[] args){
        
        String s1 = "ciao";
        
        for(int i = 0; i < s1.length(); i++){
            if(i < s1.length()){
                
                System.out.print(s1.charAt(i));  
                
                if(i < (s1.length())-1){
                    System.out.print("-");
                }
            }
                
        }
        
        
        
    }
}