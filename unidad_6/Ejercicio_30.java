/* Ordenamiento tipo Burbuja. Escribir un programa para realizar el ordenamiento de un vector de 5 números
enteros. El usuario ingresa los números que él desea, cree un vector para guardar temporalmente dichos datos
y luego realice el ordenamiento del mismo a través del método de ordenamiento tipo burbuja.*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_30 {
    public static void main(String[] args) {
        int posiciones = 5;
        int [] arreglo = crearArreglo(posiciones);
        int[] arregloModificado = metodoBurbuja(arreglo);
        
        System.out.println("El arreglo queda:");
        mostrarArreglo(arreglo);
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        int numero = entrada.nextInt();
        return numero;
    }
    static int [] crearArreglo(int numero){
        int[] num = new int[numero];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = leerNumero("Valor " + (i+1) + " de " + num.length + ": ");
        }
        return num;
    }
    static int[] metodoBurbuja (int[] num){
        int i, j, aux;
        for (i = 0; i < num.length - 1; i++) {
            for (j = 0; j < num.length - i - 1; j++) {
                if (num[j + 1] < num[j]) {
                aux = num[j + 1];
                num[j + 1] = num[j];
                num[j] = aux;  
                }
            }
        }
        return num;
    }
    static void mostrarArreglo (int [] num){
        for (int i= 0; i<num.length; i++){
        //for (int i : num) {
             System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }    
}

 
    


