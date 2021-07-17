public class principal {
    public static void main(String[] args) {
        ListaCircular l = new ListaCircular();
        System.out.println(l.vacio());
        l.ingresarNodo(34);
        l.ingresarNodo(56);
        l.ingresarNodo(12);
        l.ingresarNodo(78);
        l.ingresarNodo(32);
        l.ingresarNodo(3);
        l.desplegarLista();
        System.out.println(l.vacio());

    }



}
