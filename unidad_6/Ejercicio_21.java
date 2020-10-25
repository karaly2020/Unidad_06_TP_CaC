/*Desarrollar un algoritmo que permita ingresar tres cadenas de texto. La computadora muestra una cadena 
completa que representa a las tres ingresadas en orden inverso, separadas por un espacio. Se debe informar
la longitud de la cadena resultante. Ejemplo: Ingresa “Estoy”, “aprendiendo” y “programación”, debe devolver
“programación aprendiendo Estoy” con longitud 30.”..*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String palabra1, palabra2, palabra3, frase;
        int longitud;
        palabra1 = leerNombre("Ingrese la primera palabra: ");
        palabra2 = leerNombre("Ingrese la segunda palabra: ");
        palabra3 = leerNombre("Ingrese la tercera palabra: ");      

        frase = crearFrase(palabra1, palabra2, palabra3);
        mostrarFrase("La frase original es: " , frase);
        frase = crearFrase(palabra3, palabra2, palabra1);
        longitud = medirFrase(frase);
        mostrarFrase("La frase invertida es:" , frase +". Tiene una longitud de " +longitud);
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String nombre = entrada.nextLine();
        return nombre;
    }
    static String crearFrase (String pal1, String pal2, String pal3){
        String frase;
        frase = pal1 + " " + pal2 + " " + pal3;
        return frase;
    }
    static void mostrarFrase (String cartel, String frase){
        System.out.println(cartel +" "+ frase);
    }
    static int medirFrase (String frase){
        int longitud;
        longitud = frase.length();
        return longitud;
    }
}

 
    


