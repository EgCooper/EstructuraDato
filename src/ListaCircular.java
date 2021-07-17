public class ListaCircular {
    nodo primero;
    nodo ultimo;

    public ListaCircular(){
            primero = null;
            ultimo= null;
    }
    public void ingresarNodo (int x){
        nodo nuevo = new nodo();
        nuevo.dato = x;

        if (primero == null){
            primero = nuevo;
            ultimo = primero;
            primero.siguiente = ultimo;

        }else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;

        }


    }
    public void desplegarLista(){
        nodo actual = new nodo();
        actual = primero;
        do {
            System.out.println("" + actual.dato);
            actual = actual.siguiente;
        }while(actual != primero);
    }
    public boolean vacio(){
        return primero == null;
    }




}
