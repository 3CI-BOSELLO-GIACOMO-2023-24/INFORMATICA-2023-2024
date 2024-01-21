import javax.swing.*;
public class Controllo_dell_input{
    public static void main(String[] args){
       float cateto1 = Float.parseFloat(JOptionPane.showInputDialog("Inserisci misura cateto 1"));
       float cateto2 = Float.parseFloat(JOptionPane.showInputDialog("Inserisci misura cateto 2"));
       float ipotenusa = Float.parseFloat(JOptionPane.showInputDialog("Inserisci misura ipotenusa"));
       
       if (cateto1 <= 0 || cateto2 <= 0 || ipotenusa <= 0 || (cateto1 + cateto2) < ipotenusa || (cateto1 + ipotenusa) < cateto2 || (cateto2 + ipotenusa) < cateto1 ){
           System.out.println("Misure errate");
           
           }else{
           System.out.println("Misure corrette");
       }
    }
}
