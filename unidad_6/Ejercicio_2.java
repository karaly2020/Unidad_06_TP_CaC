/* Desarrollar un algoritmo que permita mostrar un arreglo de enteros con sus valores a la mitad. 
Ejemplo: Arreglo {1,2,3,4}, la computadora muestra: 0.5 1.0 1.5 2.0.*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        double[] numeros = {1,2,3,4};
        System.out.println("Muestro arreglo numeros antes de invocar:");
        mostrarArreglo(numeros);
        dividirEnterosALaMitad(numeros);
        System.out.println("Muestro arreglo numeros luego de invocar:");
        mostrarArreglo(numeros);
        }
    static void dividirEnterosALaMitad (double[] num){
                
        for (int i = 0; i < num.length; i++) {
           num[i]/=2; 
        }
    }
    static void mostrarArreglo (double[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
}
        
