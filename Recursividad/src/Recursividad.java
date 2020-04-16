import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Recursividad {

    public static void main(String[] args) {
     //Recursividad: metodo que se llama asi mismo, para reduciendolo en subproblemas
         
        String palabra = JOptionPane.showInputDialog(null, "Ingresa tu nombre");
        System.out.println(InvertirPalabra(palabra, palabra.length()-1));
        
        Recursividad vaso= new Recursividad();
        vaso.BajarEscalera(10);
        
    }
    public static String InvertirPalabra(String palabra, int longitud){
         
        if(longitud==0){
            return palabra.charAt(longitud)+"";
        }else{
             //Haciendo uso de la recursividad
            return palabra.charAt(longitud) + (InvertirPalabra(palabra, longitud-1));
        }
         
    }
    
    public void BajarEscalera(int Escalones){
        
        if(Escalones==0){
            System.out.println("Has bajado");
        }else{          
            try {
                //Haciendo uso de la recursividad
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Recursividad.class.getName()).log(Level.SEVERE, null, ex);
            }
              System.out.println("Bajando piso "+ Escalones);
        BajarEscalera(Escalones-1); 
         }
}
    }
    
    

