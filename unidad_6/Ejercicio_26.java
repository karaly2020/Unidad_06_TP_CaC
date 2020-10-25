/* Crear un programa que pida su nombre al usuario y lo escriba al revés (de
la última letra a la primera: a partir de “Nacho” escribiría “ohcaN”)...*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_26 {
    public static void main(String[] args) {
        String nombre, nombreInvertido;
        
        nombre = leerNombre("Ingrese el nombre del usuario: ");
        nombreInvertido = InvertirNombre(nombre);
        mostrarNombre("El nombre invertido es: " , nombreInvertido);
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String nombre = entrada.nextLine();
        return nombre;
    }
    static String InvertirNombre (String cadena){
        String nombreInvertido = "";
        
        for (int i = cadena.length()-1; i>=0; i--){
            nombreInvertido += cadena.substring(i, i+1);
        }
        return nombreInvertido;
    }
    static void mostrarNombre(String cartel, String frase){
        System.out.println(cartel +" "+ frase);
    }
}

 
    


