/* Crear una función iniciales, que devuelva una cadena formada por las iniciales de la frase que se 
indique como parámetro (primera letra y la letra que haya tras cada espacio; por ejemplo, para
“Juan Pérez” devolvería “JP”)..*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_25 {
    public static void main(String[] args) {
        String nombre, palabra1, palabra2;
        String [] arreglo;
        
        nombre = leerNombre("Ingrese el nombre completo de la persona: ");
        arreglo = separarCadena(nombre);
        palabra1 = buscarPirmeraLetra (arreglo, 0);
        palabra2 = buscarPirmeraLetra (arreglo, 1);
        System.out.println("Las iniciales de la persona son: "  + palabra1 + palabra2);
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        
        String nombre = entrada.nextLine();
        return nombre;
    }
    static String [] separarCadena(String cadena){
        String [] arreglo = cadena.split(" ");
        return arreglo;
    }
    static String buscarPirmeraLetra (String [] cadena, int palabra){
        String letra;
        letra = cadena[palabra].substring(0, 1);
        return letra;
    }
}

 
    


