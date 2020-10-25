/* Buscar los dos mayores de un array de N datos. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_13 {
    public static void main(String[] args) {
        int posiciones, numeroMayor1, numeroMayor2;
        
        posiciones = leerNumero("Ingrese la cantidad de numeros que quiere guardar en el arreglo:");
        int [] numeros = crearArregloDeNumeros(posiciones);
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
        numeroMayor1 = buscarMayor(numeros, -1);
        numeroMayor2 = buscarMayor(numeros, numeroMayor1);
        System.out.println("Los dos numeros mayores son " +numeros[numeroMayor1] + " y " +numeros[numeroMayor2]);
    }
    static void mostrarArreglo (int[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static int buscarMayor (int[]num, int numMayor1){
        int numMayor = 0, posMayor = 0;
        for (int i= 0; i<num.length; i++){
            if (num[i]>numMayor && ( i!=numMayor1)){
                numMayor = num[i];
                posMayor = i;
            }
        }
        return posMayor;
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