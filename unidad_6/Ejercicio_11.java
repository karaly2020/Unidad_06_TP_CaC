/* Cargar un vector con números aleatorios y poner en blanco una posición determinada por el usuario. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, posicionEliminada;
        
        System.out.println("Ingrese la cantidad de numeros quiere guardar en el arreglo:");
        posiciones = entrada.nextInt();
        Integer[] numeros = crearArregloDeNumeros(posiciones);
        System.out.println("Muestro arreglo generado:");
        mostrarArreglo(numeros);
        System.out.println("Digite la posicion que desea eliminar del arreglo:");
        posicionEliminada = entrada.nextInt();
        numeros [posicionEliminada-1] = null;
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
        }
    static void mostrarArreglo (Integer[]num){
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static Integer[] crearArregloDeNumeros (Integer tam){
        Integer [] num = new Integer[tam];
        
        for (int i = 0; i < num.length; i++) {
        num[i] = (int)(Math.random()*10);
        }
        return num;
    }
}
        
