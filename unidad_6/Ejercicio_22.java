/*Desarrollar un algoritmo que, dada una cadena, la computadora la muestre en formato oración, es decir, 
con la primera letra en mayúsculas, seguido del resto de la cadena en minúsculas y el agregado de un punto
final. Ejemplo: Ingresa “uN aUtO aZul”, debe devolver “Un auto azul.”..*/
package unidad_6;
import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        String fraseOriginal, fraseModificada;
        
        fraseOriginal = leerNombre("Ingrese la frase: ");
        fraseModificada = modificarFrase(fraseOriginal);
        mostrarFrase("La frase original es:" , fraseOriginal);
        mostrarFrase("La frase modificada es:" , fraseModificada);
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String nombre = entrada.nextLine();
        return nombre;
    }
    static String modificarFrase (String oracion){
        String frase;
        frase = oracion.toUpperCase().charAt(0)+ oracion.substring(1, oracion.length()).toLowerCase()+".";
        
        return frase;
        }
    static void mostrarFrase (String cartel, String frase){
        System.out.println(cartel +" "+ frase);
        }
    }

 
    


