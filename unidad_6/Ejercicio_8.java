/* Desarrollar un algoritmo que permita ingresar 5 números pertenecientes al arreglo A y otros 5 números pertenecientes 
al arreglo B. La computadora crea y muestra un arreglo C, donde cada posición es el resultado de la suma del 
número en la misma posición en el arreglo A con el número en la misma posición en el arreglo B. Ejemplo: Se 
ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra: 5 9 4 7 11. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] arregloC;
        
        System.out.println("Ingrese los valores del arreglo 'A':");
        int[] arregloA = crearArregloDeNumeros(5);
        System.out.println("Ingrese los valores del arreglo 'B':");
        int [] arregloB = crearArregloDeNumeros(5);
        System.out.println("Arreglo [A]:");
        mostrarArreglo(arregloA);
        System.out.println("Arreglo [B]:");
        mostrarArreglo(arregloB);
        arregloC = sumarArreglo(arregloA, arregloB);
        System.out.println("El arreglo [C] queda:");
        mostrarArreglo(arregloC);
    }
    static void mostrarArreglo (int[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    
    static int[] sumarArreglo (int[]arregloA,int[]arregloB ){
        int[] arregloSalida = new int[arregloA.length];
        
        for (int i= 0; i<arregloA.length; i++){
            arregloSalida [i]  = arregloA [i] + arregloB [i];
        }
        return arregloSalida;
    }
    
    static int[] crearArregloDeNumeros(int tamano){
        int[] nuevoArreglo = new int[tamano];
        
        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = leerNumero("Valor " + (i+1) + " de " + nuevoArreglo.length + ": ");
        }
        return nuevoArreglo;
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        
        int numero = entrada.nextInt();
        return numero;
    }
}