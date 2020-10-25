/* CreaR un array o arreglo unidimensional con un tamaño de 5, asignale los valores numéricos ingresados
por teclado y muestralos por pantalla. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = crearArregloDeEnteros(5);
        
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
        }
    static void mostrarArreglo (int[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static int[] crearArregloDeEnteros (int tam){
        int[] num = new int[tam];
        
        for (int i = 0; i < num.length; i++) {
            
        num[i] = leerEntero("Valor " + (i+1) + " de " + num.length + ": ");
        }
        return num;
    }
    static int leerEntero (String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        int x = entrada.nextInt();
        
        while ( (int) x != x ) {
            System.out.print("ERROR. " + cartel);
            x = entrada.nextInt();
        }
        return (int) x;
    }
}