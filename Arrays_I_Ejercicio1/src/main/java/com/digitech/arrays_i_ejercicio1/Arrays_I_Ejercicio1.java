

package com.digitech.arrays_i_ejercicio1;

/**
 *  Diseñar un array, que almacena los números del 1 al 10. Consideraciones:
     Utilizar un bucle for para cargar el array
     Se deben imprimir los datos del array en sentido inverso
 * @author SergioAT
 */
public class Arrays_I_Ejercicio1 {

    public static void main(String[] args) {
        
        int[] num = new int[10];
        int index=0;
        
        for (int i=10; i>0; i--)
        {
            num[index]=i;
            index=index+1;                       
        }
        
        for (int j=0; j < 10; j++){
                System.out.print("[ " + num[j] + " ]");
            }
        
        
    }
}
