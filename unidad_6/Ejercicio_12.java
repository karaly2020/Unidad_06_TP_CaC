/* Crear un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear una función
que rellene el array o arreglo con los múltiplos de un número pedido por teclado. Por ejemplo, si defino un array
de tamaño 5 y elijo un 3 en la función, el array contendrá 3, 6, 9, 12, 15. Mostrarlos por pantalla usando otra
función distinta. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, numMultiplo;
        
        System.out.println("Ingrese un numero para definir el tamano del arreglo:");
        posiciones = entrada.nextInt();
        System.out.println("Ingrese un numero para definir el multiplo:");
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
            num[i] = (i * multiplo)+ multiplo;
        }
        return num;
    }
}