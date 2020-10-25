/* Desarrollar un algoritmo que permita pedir al usuario un número entero T y otro M. La computadora crea
un arreglo de enteros de T posiciones cargado con los múltiplos de M y lo muestra. Ejemplo: Se ingresa 4 y 6,
la computadora muestra: 0 6 12 18. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, numMultiplo;
        
        System.out.println("Ingrese un numero 'T' para definir el tamano del arreglo:");
        posiciones = entrada.nextInt();
        System.out.println("Ingrese un numero 'M' para definir el multiplo:");
        numMultiplo = entrada.nextInt();
        int [] numeros = crearArregloDeNumeros(posiciones, numMultiplo);
        
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
    }
    static void mostrarArreglo (int[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static int[] crearArregloDeNumeros(int tamano, int multiplo){
        int[] num = new int[tamano];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = i * multiplo;
        }
        return num;
    }
}