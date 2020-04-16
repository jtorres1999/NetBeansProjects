
import javax.swing.JOptionPane;


public class ListasEnlazadas {

    public static void main(String[] args) {
    
    //Puntero: es una variable que hace referencia a una region de la memoria
    //Nodo: Es un elemento de una lista enlazada, cada estructura dispondraa de varios registros
    Lista listica= new Lista();//Creacion de un objeto
    int Opcion=0, el;
        do {            
            try {
                Opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                       "1. Agregar un elemento al inicio\n. 2. Mostrar datos\n"
                               + "3. Salir", "Menu de opciones",3));
                switch(Opcion){
                    case 1://Solicitamos al dato
                        
                        try {//Para validar
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingrese el Elemento: ","Insertando al inicio", 3));
                            //Con el objeto agregamos al Nodo
                            listica.Regresar(el);
                            
                        } catch (NumberFormatException n) {//para validar que ingresen un numero
                       //Poner mensajes de error
                       JOptionPane.showInputDialog(null, "ERROR"+ n.getMessage());
                        }
                        break;
                    
                    case 2:
                        listica.MostrarLista();
                        break;
                    case 3:
                        
                        break;
                    default:
                        JOptionPane.showMessageDialog(null," Esta equivocado cara de verga");
                }
                
                
            } catch (Exception e) {
                JOptionPane.showInputDialog(null, "Error"+ e.getMessage());
            }
        } while (Opcion!=3);
    
    
    }
    
}
