/* Crear un programa que pida al usuario su nombre y apellidos y los muestre con las mayúsculas y 
minúsculas correctas (aparecerán en mayúsculas la primera letra y la que haya tras cada espacio; 
las demás aparecerán en minúsculas. Por ejemplo, si introduce “nAcho cabaNes”, es escribirá “Nacho Cabanes”).*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_29 {
    public static void main(String[] args) {
        String nombreCompleto;
        int palabras;
        String [] arreglo;
        
        nombreCompleto = leerNombre("Ingrese su nombre y apellido: ");
        palabras = contarPalabras(nombreCompleto);
        arreglo = separarCadena(nombreCompleto);
        arreglo = cambiarArreglo(arreglo, palabras);
        mostrarArreglo(arreglo);
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String frase = entrada.nextLine();
        return frase;
    }
    static String [] separarCadena(String cadena){
        String [] arreglo = cadena.split(" ");
        return arreglo;
    }
    static int contarPalabras (String cadena){
        int contador = 0;
        String letra;
        for(int i=0;i<cadena.length();i++) {
            letra = cadena.substring(i,i+1);
            if (letra.equals(" ")){
             contador ++;   
            }
        }
        contador ++; 
        return contador;
    }
    static String [] cambiarArreglo (String [] cadena, int contador){
        String [] arreglo = new String[contador];
        for(int i=0;i<=contador-1;i++) {
           arreglo[i] = cadena[i].substring(0, 1).toUpperCase() + cadena[i].substring(1).toLowerCase() ;
            }
        return arreglo;
    } 
    static void mostrarArreglo (String [] palabra){
        
        for (int i= 0; i<palabra.length; i++){
        System.out.print(palabra[i] + " ");
        }
        System.out.println(" ");
    }
}

 
    


