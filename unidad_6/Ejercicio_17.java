/* Crear una matriz n x n y llenarla con los números que el usuario desee. Sume todos los números 
que componga la columna 1 y muestre el resultado por pantalla. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas, columnas, suma;
        
        System.out.println("Ingrese un numero para definir el numero de filas de la matriz:");
        filas = entrada.nextInt();
        System.out.println("Ingrese un numero para definir el numero de columnas de la matriz:");
        columnas = entrada.nextInt();
        int [][] numeros = crearMatrizDeNumeros (filas, columnas);
        
        System.out.println("La matriz queda:");
        mostrarMatriz(numeros);
        
        suma = SumaColumnasMatriz (numeros);
        System.out.println("La suma de la columna [1] es:  " +suma);
    }
    static void mostrarMatriz (int [][]num){
        
        for (int i= 0; i<num.length; i++){
            for (int j= 0; j <num[i].length; j++){
                System.out.print(num[i][j] + " ");
            }
        System.out.println(" ");
        }
    }
    static int SumaColumnasMatriz (int [][]matriz){
        int sumaColumna = 0;

        for (int i=0; i<matriz.length; i++){
            sumaColumna += matriz [i][0];
        }
        return sumaColumna;
    }
    static int[][] crearMatrizDeNumeros(int filas, int columnas){
        int[][] num = new int[filas] [columnas];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j< num[i].length; j++) {
                num[i][j] = leerNumero("Introduzca el elemento [" + i + "," + j + "]");
            }
        }
        return num;
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        int x = entrada.nextInt();
        return (int) x ;
    }
}