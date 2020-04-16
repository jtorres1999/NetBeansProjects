
public class Nodo {
public int Dato;
public Nodo siguiente;
//constructor para insertar aal final
    public Nodo(int j) {
        this.Dato=j;
    }
//Constructor para insertar al Inicio
    public Nodo(int j, Nodo s) {
        Dato=j;
        siguiente=s;
    }
    

}
