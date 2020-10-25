/* Llenar un vector con números enteros (números positivos ó negativos). Mostrar la cantidad de números 
positivos y la cantidad de números negativos que hay en dicho arreglo. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, numerosPositivos;
        
        System.out.println("Ingrese un numero para definir el tamano del arreglo:");
        posiciones = entrada.nextInt();
        int [] num = crearArregloDeNumeros(posiciones);
        
        numerosPositivos = contarPositivos(num);
        System.out.println("El arreglo tiene :" + numerosPositivos+ " numero(s) positivo(s) y " + (posiciones - numerosPositivos)
                +  " numero(s) negativo(s)");
    }
    static int contarPositivos (int[]arreglo){
        int cantidadPositivos = 0;
        
        for (int i= 0; i<arreglo.length; i++){
             if (arreglo [i] >=0 ){
                 cantidadPositivos++;
             }
        }
        return cantidadPositivos;
    }
    static int[] crearArregloDeNumeros(int tamano){
        int[] numeros = new int[tamano];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leerNumero("Valor " + (i+1) + " de " + numeros.length + ": ");
        }
        return numeros;
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        
        int numero = entrada.nextInt();
        return numero;
    }
}