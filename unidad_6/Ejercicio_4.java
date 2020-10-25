/* CreaR un array unidimensional con un tamaño de 10, inserta los valores numéricos que desees
de la manera que quieras y muestra por pantalla la media de valores (promedio) del array. 
Nota: puede utilizar el método random de la Clase Math para generar números aleatorios al cargar el
array. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double promedio = 0;
        int[] numeros = crearArregloDeEnteros(10);
        
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
        promedio = promedioArreglo(numeros);
        System.out.println("El promedio es: " +promedio);
        }
    static void mostrarArreglo (int[]num){
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static double promedioArreglo (int[] num){
        double suma = 0, promedio = 0; 
        for (int i = 0; i < num.length; i++) {
           suma += num [i]; 
        }
        promedio = suma/num.length;
        return promedio;
    }
    static int[] crearArregloDeEnteros (int tam){
        int[] num = new int[tam];
        for (int i = 0; i < num.length; i++) {
        num[i] = (int)(Math.random()*10);
        }
        return num;
    }
}
        
