package mates;
public class Funciones {

    //ejercicio 4 apartado 1
    public static int sumaNaturales(int n){
        int acumulado = 0;
        //en el for pueden no ponerse llaves 
        for (int i = 1; i <= n; i++) 
            //no se pone acumulado++ porque solo se le sumaria +1 +1 
            acumulado +=i;
        
        return acumulado;

    }

    //ejercicio 4 apartado 2
    public static int factorial(int n){
        int acumulado = 1;
        for (int i = 1; i <= n; i++) 
        //acumulado=acumulado*i    
        acumulado *= i;
        
        return acumulado;
    }

    //ejercicio 4 apartado 3
    public static int potenciaNesima(int n){
        int acumulado = 1;
        for (int i = 1; i <= n; i++) 
        //acumulado=acumulado*n    
        acumulado *= n;
        
        return acumulado;
    }

    //ejercicio 4 apartado 4
    public static int sumaListaNumeros(int[] lista){
        int acumulado = 0;
        for (int i = 0; i < lista.length; i++) 
        //acumulado=acumulado+lista[i]    
        acumulado += lista[i];
        
        return acumulado;
    }

    //ejercicio 4 apartado 5
    public static  int mediaListaNumeros(int[] lista){
        int acumulado = 0;
        for (int i = 0; i < lista.length; i++) 
        acumulado = (acumulado+lista[i])/lista.length;

        return acumulado;
        
        
    }

    //ejercicio 4 apartado 6
    public static double desviacionTipica(int[] array){
        double acumulador = 0;
        for(int i = 0; i < array.length; i++){
            acumulador += Math.pow(array[i] - mediaListaNumeros(array),2);
        }
        return Math.sqrt(acumulador/array.length);

    }

    //ejercicio 4 apartado 7
    public static int sumaPares(int n){
        int acumulador = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                acumulador += i;
            }
        }
        return acumulador;
       
    }

    //ejercicio 4 apartado 8
    public static int sumaParesDos(int[] arrayList){
        int acumulador = 0;
        //el valor que tenga el array se pone en la i con el for each
        for(int i : arrayList){
            if(i%2 == 0){
                acumulador += i;
            }
        }
        return acumulador;
    }

    //ejercicio 4 apartado 9
    public static String obtenerListaPar(int[] arrayList){
        String listaPares = "";
        for(int i : arrayList){
            if(i%2 == 0){
                listaPares += i + " ";
            }
        }
        return listaPares;
    }

    //ejercicio 4 apartado 10
    public static String listaPares(int n){
        String lista = " ";
        //a i se le asigna el valor de n y mientras i sea mayor o igual a 2 se le resta 1
        for(int i = n ; i >= 2; i--){
            if(i%2 == 0){
                lista += i + ",";
            }
        }
        return lista;
    }

    //ejercicio 4 apartado 11
    public static int productoVectorial(int[] arrayList1,int[] arrayList2){
        int acumulador = 0;
        for(int i = 0; i < arrayList1.length; i++){
            acumulador+= arrayList1[i] * arrayList2[i];
        }

        return acumulador;
    }

}
