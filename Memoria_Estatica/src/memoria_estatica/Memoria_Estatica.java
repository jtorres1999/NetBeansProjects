
package memoria_estatica;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Memoria_Estatica {

   
    public static void main(String[] args) {
        //ARRAYSLIST EJERCICIO
     ArrayList < String > cadenas = new ArrayList <String>();
     String Preguntas, Request, Preg, Pregunt;
        do {            
            Preguntas=JOptionPane.showInputDialog(null, "INGRESA Cantante");
            Preg=JOptionPane.showInputDialog(null, "Disco con mas ventas");
            cadenas.add(Preguntas);
            Request=JOptionPane.showInputDialog(null, "Deseas ingresar otro cantante");
            Request=Request.toUpperCase();
            System.out.println("Cantante: "+"{"+Preguntas+"]"+" Disco mas vendido: "+Preg+"]");
        } while (!Request.equals("NO"));
     //Utilizando el metodo SET para modificar
     cadenas.set(1, "La que modifique");
    
    //Eliminar frases
    cadenas.remove(0);
        
     
     
     
     
     //ARRAY este es un ejercicio
        int numeros []= new int [5];
      int i;
      String nombres []= new String [5];
      for (i=0; i<5;i++) {
          numeros [i]=Integer.parseInt(JOptionPane.showInputDialog
        (null, "Ingrese el elemento del indice "+ i));       
          
      }     
      System.out.println(" los datos son  ");  
        for (i=0;i<5;i++){
              System.out.println("[ "+ numeros[i]+" ]");
             
          }
        System.out.println("Datos ordenados");
        Arrays.sort(numeros);//PARA ORDENAR Vectores tipo INT
        for(i=0;i<5;i++){
           System.out.println("[ "+ numeros[i]+" ]");
        }
        
       //Rellenar un Arrays
       //Ejercicio 2
        Arrays.fill(nombres, "Bienvenido");
        for(i=0; i<5;i++){
          System.out.println("[ "+ nombres[i]+" ]");
        }
       
    }
    }
    
