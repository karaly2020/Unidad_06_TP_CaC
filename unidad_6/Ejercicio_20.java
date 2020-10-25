/*Desarrollar un algoritmo que permita ingresar una cadena de texto. La computadora muestra la cadena
enteramente en mayúsculas. Ejemplo: Ingresa “Computadora”, debe devolver “COMPUTADORA”.*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_20 {
    public static void main(String[] args) {
        String str = (new String("computadora"));
        mostrarCadenaMayusculas (str);
    }
    static void mostrarCadenaMayusculas (String cadena){
         System.out.println(cadena.toUpperCase());
        }
}

