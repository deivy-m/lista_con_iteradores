import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListaArreglos {
    public static <list> void main(String[] args) {
        //se crea el array
        List<String> listaColores = new ArrayList<>();

        //creacion mediante la clase Array
        String[] nombres = {"Arturo", "Daniel", "Pamela"}; // se puede trasnformar el vector en una lista
        List<String> listaNombres = Arrays.asList(nombres);

        //Adicion de elementos individuales
        listaColores.add("Verde");
        listaColores.add("Amarillo");
        listaColores.add("Rojo");
        //listaColores.remove();

        //Construir lista a partir de otra
        List<String> listaElementos = new ArrayList<>(listaColores);

        System.out.println("Lista nombres:");
        //listaElementos.forEach(System.out::println); Imprime toda la lista

        ListIterator<String> iterador1 = listaNombres.listIterator();
        System.out.println("Hacia adelante");
        while (iterador1.hasNext()){
            System.out.println("Nombres: "+iterador1.next());
        }
        System.out.println("Hacia atras");
        while (iterador1.hasPrevious()){
            System.out.println("Nombres: "+iterador1.previous());
        }

        //eliminacion con iteracion
        while (iterador1.hasPrevious()){
            if (iterador1.previous().equals("Pamela")){
                iterador1.remove();
            }
        }
        System.out.println("Lista nombres completo");
        ListIterator<String> iterador2 = listaNombres.listIterator();
        for(iterador2 = listaNombres.listIterator(); iterador2.hasNext();){
            System.out.println("Nombre Pamela" + iterador2.next());
        }




    }
}