import javax.swing.*;
public class Voto_sufficiente_o_non{
    public static void main(String[] args){
        
        float voto = Float.parseFloat(JOptionPane.showInputDialog("Inserisci il voto"));
        
        if (voto < 6){
            System.out.println("Voto insufficiente");
        }else if (voto == 6){
            System.out.println("Voto sufficiente");
        }else if (voto > 6){
            System.out.println("Voto più che sufficiente");
        }
    }
}
