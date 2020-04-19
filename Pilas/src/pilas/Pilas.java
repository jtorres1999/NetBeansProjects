package pilas;

import javax.swing.JOptionPane;


public class Pilas {

    public static void main(String[] args) {
        //Pila es una coleccion ordenada de elementos a los cuales solo se puede acceder por un unico lugar
     int opcion=0, elemento, tamaño;
        try {
            tamaño=Integer.parseInt(JOptionPane.showInputDialog
        (null, "De que tamaño es tu pila",JOptionPane.INFORMATION_MESSAGE));
       pila pilita= new pila(tamaño);
        } catch (NumberFormatException n) {
            JOptionPane.showInputDialog(null,"ERROR"+ n.getMessage());
        }
   
    }
    
}
