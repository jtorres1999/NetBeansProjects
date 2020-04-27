import java.util.Stack;
import javax.swing.JOptionPane;
public class Pilas_claseStack {

    public static void main(String[] args) {

        Stack pila= new Stack();
     //Push es el metodo indicado para las pilas.
     //Diferencia de push y add, no necesita indice push en cambio add si.
        pila.push(12);
        pila.push(18);
        pila.push(22);
        pila.push(30);
        pila.push(28);
        //Para ver el tamaño .size
        System.out.println("Tamaño inicial"+pila.size());
        //Utilizamos el metodo .peek para que te muestre la cima de la pila
        JOptionPane.showMessageDialog(null,"La cima de la pila es "+pila.peek());
        // Utilizamos el metodo .pook para sacar un elemnto de la pila
        JOptionPane.showMessageDialog(null,"Para sacar el ultimo elemento que es "+ pila.pop());
        System.out.println("Tamaño final"+pila.size());
        //Utilizamos .isEmpty para saber si la pila tiene elementos
        System.out.println("La pila esta vacia "+pila.isEmpty());
    }
    
}
