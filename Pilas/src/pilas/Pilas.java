package pilas;

import javax.swing.JOptionPane;


public class Pilas {

public static void main(String[] args) {
        //Pila es una coleccion ordenada de elementos a los cuales solo se puede acceder por un unico lugar
int opcion=0, elemento, tamaño;
//boolean cosa=;
    try {
        tamaño=Integer.parseInt(JOptionPane.showInputDialog
        (null, "De que tamaño deseas tu pila","MENU DE OPCIONES",JOptionPane.INFORMATION_MESSAGE));
    pila pilita= new pila(tamaño);
    do {                
        opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Empujar un elemento a la pila\n "
                        +"2. Sacar un elemento\n"
                        +"3. Esta vacia la pila?\n"
                        +"4. Esta llena la pila\n"
                        +"5. Ultimo elemento\n"
                        +"6. Tamaño de la pila\n"
                        +"7. Salir\n"
                        +"QUE DESEAS HACER?", 
                        JOptionPane.INFORMATION_MESSAGE));
        switch(opcion){
            case 1:
                    elemento=Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Ingrese elemento"," Apilando",JOptionPane.INFORMATION_MESSAGE));
                    if (!pilita.Llena()) {
                    pilita.Push(elemento);
                    }else {
                    JOptionPane.showMessageDialog(null,"Pila llena "
                    ,"Pila llena",JOptionPane.INFORMATION_MESSAGE);
                    }
            break;
            case 2:
                if (!pilita.Vacia()) {
                    JOptionPane.showMessageDialog(null,"Elemento obtenido es "+
                            pilita.Sacar(),"Obteniendo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Pila vacia "+
                            pilita.Sacar(),"Pila Vacia",JOptionPane.INFORMATION_MESSAGE);
                }
            break;
            case 3:
                if (pilita.Vacia()) {
                    JOptionPane.showMessageDialog(null,"Pila vacia "
                    ,"Pila Vacia",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Pila no esta vacia "
                    ,"Pila llena",JOptionPane.INFORMATION_MESSAGE);
                 }
            break;
            case 4:
                if (pilita.Llena()) {
                    JOptionPane.showMessageDialog(null,"Pila llena "
                    ,"Pila llena",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"Pila no esta llena "
                    ,"Pila vacia",JOptionPane.INFORMATION_MESSAGE);
                }
            break;
             case 5:
                 if (!pilita.Vacia()) {
                  JOptionPane.showMessageDialog(null,"Elemento en la cima es "+
                    pilita.cima(),"cima de la pila",JOptionPane.INFORMATION_MESSAGE);
                 } else {
                          JOptionPane.showMessageDialog(null,"Pila esta vacia "
                    ,"Pila vacia",JOptionPane.INFORMATION_MESSAGE);
                 }
            break;
            case 6:
                  JOptionPane.showMessageDialog(null,"El tamaño de la pila es "+
                  pilita.Tamaño()," Pila vacia",JOptionPane.INFORMATION_MESSAGE);
            break;
            case 7:
                JOptionPane.showMessageDialog(null,"App Finalizada","FINALIZADA",JOptionPane.INFORMATION_MESSAGE);        
            break;
            default:
            JOptionPane.showMessageDialog(null,"Opcion","Incorrecta",JOptionPane.INFORMATION_MESSAGE);
                             
            }
            } while (opcion !=7);
        } catch (NumberFormatException n) {
            JOptionPane.showInputDialog(null,"ERROR"+ n.getMessage());
        }
   
    }
    
}
