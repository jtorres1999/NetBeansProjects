
package pilas;
public class pila {
    int VectorPila[];
    int cima;
    
    public pila(int Tamaño){
        VectorPila=new int[Tamaño];
        cima= -1;
        
    }
    public void Push (int Dato){
        cima++;
        VectorPila[cima]=Dato;
    }
    public int Sacar(){
      int fuera =VectorPila [cima]; 
      cima--;
        return fuera;
      
    }
    //Metodo para saber si la pila esta vacia
    public boolean Vacia (){
        return cima==-1;
        
    }
     //Metodo para saber si la pila esta llena
    public boolean Llena(){
        return VectorPila.length-1==cima;
    }
    //Metodo para saber que elemento esta en la cima
    public int cima(){
        return VectorPila[cima];
        }
    //Metodo para el tamaño de la piila
    public int Tamaño(){
        return VectorPila.length;
        
    }
}
