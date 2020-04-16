public class Lista {
//Puntero para ubicar el inicio y el fin    
protected Nodo inicio, fin;    

    public Lista() {
    inicio=null;
    fin=null;
    
    }
    //Metodo para agregar un Nodo al Inicio de la lista
    public void Regresar(int palabra){
        //Creamos el nodo
        inicio= new Nodo(palabra, inicio);
        if (fin==null) {
            fin=inicio;
        }
        
    }
    public void MostrarLista( ){
        Nodo recorrer=inicio;
        while (recorrer!=null) {
            System.out.println("^ "+recorrer.Dato+" ^");
            recorrer= recorrer.siguiente;
            
        }
    }
            

}
