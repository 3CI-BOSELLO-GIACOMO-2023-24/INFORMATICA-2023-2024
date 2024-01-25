
/**
 * Letto il prezzo di una sciarpa, dire se è un prodotto economico (fino a 10 euro), 
 * regolare(superiore a 10 euro) o di lusso (superiore a 50 euro). 
 * 
 * @author Giacomo Bosello 
 * @version 1.0
 */
import javax.swing.*;
public class Es1A{
    public static void main(String[] args){
        
        int prezzo;
        
        do{
            System.out.println("Il prezzo non può essere minore o uguale a zero");
             prezzo = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il prezzo della sciarpa"));
        }while(prezzo <= 0);
        
        if(prezzo <= 10){
            System.out.println("Prodoto economico");
        }else if(prezzo > 10 && prezzo <= 50){
            System.out.println("prodotto regolare");
        }else{
            System.out.println("prodotto di lusso");
        }
    }
}

