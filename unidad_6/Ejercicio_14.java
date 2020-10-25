/* Buscar el valor mayor de un array de N datos utilizando un bucle for mejorado. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, numeroMayor;
        
        System.out.println("Ingrese la cantidad de numeros que quiere guardar en el arreglo:");
        posiciones = entrada.nextInt();
        int [] numeros = crearArregloDeNumeros(posiciones);
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
        numeroMayor = buscarMayor(numeros);
        System.out.println("El numero mayor es " +numeroMayor);
    }
    static void mostrarArreglo (int[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static int buscarMayor (int[]num){
        int numMayor = 0;
        for (int i:num){    
            if (i>numMayor){
                numMayor = i;
            }
        }
        return numMayor;
    }
    static int[] crearArregloDeNumeros(int tamano){
        int[] num = new int[tamano];
        
        for (int i = 0; i < num.length; i++) {
            
        num[i] = leerNumero("Valor " + (i+1) + " de " + num.length + ": ");
        }
        return num;
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        int numero = entrada.nextInt();
        return numero;
    }
}