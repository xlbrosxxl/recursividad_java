
package recursividad;


public class Recursividad {

    public static void main(String[] args) {
        /*
        Suma recursiva
        int numero=10;
        int resultado = SumaRecursiva(numero);
        System.out.println("la suma recursiva es "+resultado);
        */
        
        /*
        Factorial recursivo
        int numero2=5;
        int resultado2 = FactorialRecursivo(numero2);
        System.out.println("el factorial es "+resultado2);
        */
        
        /*recorrer un array
        int[] array={1,2,3,4,5};
        RecorrerArreyRecursivo(array, 0);
        */
        
        //buscar en array
        int[] array={1,2,3,4,5};
        int ElementoBuscar = 9;
        int elementoEncontrado = BuscarElementoArray(array, ElementoBuscar, 0);
        System.out.println("la posicion del elemento es "+elementoEncontrado);
    }
    
    public static int SumaRecursiva(int numero){
        int res;
        if(numero == 1){
            return 1;
        }else{
            res = numero+SumaRecursiva(numero-1);
        }
        return res;
    }
    
    public static int FactorialRecursivo(int numero){
        int res;
        
        if(numero==1){
            return 1;
        }else{
            res = numero*FactorialRecursivo(numero-1);
        }
        
        return res;
    }
    
    public static void RecorrerArreyRecursivo(int[] array, int indice){
        if(indice == (array.length-1)){
            System.out.println(array[indice]);
        }else{
            System.out.println(array[indice]);
            RecorrerArreyRecursivo(array, indice+1);
        
    }
}
    
    public static int BuscarElementoArray(int[] array,int elementosBuscar ,int indice){
        int pos;
        if(indice == array.length){
            return -1;
        }else if(array[indice] == elementosBuscar){
            return indice;
        }else{
            pos = BuscarElementoArray(array, elementosBuscar, indice+1);
        }
        
        return pos;
    }
}
