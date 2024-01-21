/**
 * Generare in modo casuale un numero tra 1 e 100
   int randomNumber = (int)(Math.random()*100);. L’utente ha 5 tentativi per indovinarlo. Se
   l’utente indovina, bisogna scrivere a video “Bravo, hai indovinato!” E il programma termina, altrimenti si danno indicazioni del tipo “Il numero da indovinare è più basso” oppure “Il numero da indovinare è più alto”. Se, al termine dei 5 tentativi, l’utente non ha indovinato, bisogna comunicare qual era il numero da indovinare.

 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Es5B{
    public static void main(String[] args){
    
        int randomNumber = (int)(Math.random()*100);
        int volte = 0;
        int utente;    

        do{
            
             utente = Integer.parseInt(JOptionPane.showInputDialog("Prova ad indovinare il numero"));
            
             if(utente == randomNumber){
                 System.out.println("Hai indovinato");
                volte+=10;
             }else if(utente < randomNumber){
                 System.out.println("Il numero è più grande");
             }else{
                 System.out.println("Il numero è più piccolo");
             }
             volte++;
        }while(volte < 5);
        
        System.out.println("Hai fnito i tentativi disponibili, il numero era: "+randomNumber);
        
           
    }
}
