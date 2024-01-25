/*
 *  L’utente inserisce una temperatura in Celsius e il calcolatore la converte in Fahrenheit ed in Kelvin. 
 *  Se la temperatura inserita è minore dello zero assoluto (-273,15), il calcolatore segnala un errore.
 */
import javax.swing.*;
public class Temperature{
    public static void main (String [] args){
        double Celsius = Double.parseDouble(JOptionPane.showInputDialog("Inserisci la temperatura in Celsius: "));
        double Fahrenheit;
        double Kelvin;
        
        if(Celsius < 273.15){
            System.out.println("ERRORE");
        }else{
            Fahrenheit = ((9/5)*Celsius)+32;
            Kelvin = Celsius + 273.15;
            System.out.println("La temperatura Fahrenheit è: "+Fahrenheit);
            System.out.println("La temperatura Kelvin è: "+Kelvin);
        }
        
    }
}