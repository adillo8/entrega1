package aplicacion;
import mates.*;
public class Principal {
    public static void main(String[] args) {
        //ejerccio 4 apartado 1
        System.out.println("la suma de los numeros hasta el 10 es "+Funciones.sumaNaturales(10));
        //ejercicio 4 apartado 2
        System.out.println("el factorial de 10 es "+Funciones.factorial(10));
        //ejercicio 4 apartado 3
        System.out.println("la potencia n-esima de 2 es "+Funciones.potenciaNesima(2));
        //ejercicio 4 apartado 4
        int[] lista = {1,2,3,4,5};
        System.out.println("la suma de los numeros de la lista es "+Funciones.sumaListaNumeros(lista));
        //ejercicio 4 apartado 5    
        System.out.println("la media de los numeros de la lista es "+Funciones.mediaListaNumeros(lista));
        //ejercicio 4 apartado 6
        System.out.println("la desviacion tipica de los numeros de la lista es "+ Funciones.desviacionTipica(lista));
        //ejercicio 4 apartado 7
        System.out.println("La suma de los primeros números pares hasta n es "+Funciones.sumaPares(9));
        //ejercicio 4 apartado 8
        System.out.println("La suma de los elementos pares de una lista de enteros es "+Funciones.sumaParesDos(lista));
        //ejercicio 4 apartado 9
        System.out.println("La lista con los números pares de la lista inicial es "+Funciones.obtenerListaPar(lista));
        //ejercicio 4 apartado 10
        System.out.println("La lista de los primeros números pares hasta n es "+Funciones.listaPares(9));
        //ejercicio 4 apartado 11
        int[] lista2 = {1,2,3,};
        int[] lista3 = {2,4,6};
        System.out.println("Producto escalar de dos listas de números es "+Funciones.productoVectorial(lista2, lista3));
    }

    
}