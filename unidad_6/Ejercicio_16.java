/* Llenar una matriz de 3 x 3 (array de 2 dimensiones) completamente de números aleatorios entre 0 y 9.. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_16 {
    public static void main(String[] args) {
        int[][] numeros = crearArregloDeNumeros (3,3);
        
        System.out.println("Muestro arreglo generado:");
        mostrarArreglo(numeros);
    }
    static void mostrarArreglo (int [][]num){
        
        for (int i= 0; i<num.length; i++){
            for (int j= 0; j <num.length; j++){
                System.out.print(num[i][j] + " ");
            }
        System.out.println(" ");
        }
    }
    static int[][] crearArregloDeNumeros (int tam1, int tam2 ){
        int[][] num = new int[tam1] [tam2];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = (int)(Math.random()*10);
            }
        }
        return num;  
    }
}

        
