import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        //declaracion de arreglos, objeto de tipo vector
        int[] numeros = new int[3];

        System.out.println(numeros[0]);
        //Inicializacion de arreglos
        numeros [0] = 1;
        //numeros [1] = 2;
        numeros[1] = Integer.valueOf( "2"); //sirve para convertir el 2 en lo que se esta solicitando en este caso el entero
        //numeros [1] = (int) 2L; //2 Bytes o 16 bits, L=long int para su capacidad de almacenamieno
        numeros [2] = -1;

        //int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];

        System.out.println("i = " + numeros[0]);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        String[] productos = new String[3]; //el 3 es la magnitud del vector
        productos[0] = "Memoria";
        productos[1] = "Samsung";
        productos[2] = "Apple";

        //System.out.println("productos[0] = "+productos[0]);
        Arrays.sort(productos); //sirve para ordenar alfabeticamente

        for(int i=0; i<3 ;i++){
            System.out.println(productos[i]);
        }

    }
}