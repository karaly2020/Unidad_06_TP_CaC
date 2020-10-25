/* Desarrollar un algoritmo que permita mostrar un arreglo de caracteres de atrás para adelante. Ejemplo: 
Arreglo {‘A’,’V’,’A’,’J’}, la computadora muestra: ‘J’ ‘A’ ‘V’ ‘A’.*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        char [] letras = {'A', 'V', 'A', 'J'};
        
        System.out.println("Muestro arreglo letras antes de invocar:");
        mostrarArreglo(letras);
        letras = invertirCaracteres(letras);
        System.out.println("Muestro arreglo letras luego de invocar:");
        mostrarArreglo(letras);
        }
    static char[] invertirCaracteres (char[] orig){
        int contador = 0;
        char[] modif = new char[orig.length];
                     
        for (int i = (orig.length-1); i >= 0; i--) {
            modif[contador] = orig [i];
            contador ++;
        }
        return modif;
    }
    static void mostrarArreglo (char[]letras){
        for (int i= 0; i<letras.length; i++){
        System.out.print(letras[i] + " ");
        }
        System.out.println(" ");
    }
}
        
