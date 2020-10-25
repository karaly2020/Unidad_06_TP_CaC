/*Desarrollar un algoritmo que, dado un número de tres cifras, la computadora muestre la suma de las 
cifras, sin realizar otra cuenta auxiliar. Ayuda: Ingresar el número como cadena, extraer cada posición
de la cadena, convertirlas a número y realizar la suma. Ejemplo: Ingresa 123, debe devolver 6.”..*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_23 {
    public static void main(String[] args) {
        String caracter;
        int suma;
        caracter = leerPalabra("Ingrese el numero: ");
        suma = sumarPalabra(caracter);
        mostrarFrase("La suma es: " , Integer.toString(suma ));
    }
    static String leerPalabra(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String nombre = entrada.nextLine();
        return nombre;
    }
    static int sumarPalabra (String palabra){
        int suma = 0;
        
        for (int i=0; i<=palabra.length()-1; i++){
                suma += Integer.parseInt(palabra.substring(i, i+1));
        }
        return suma;
        }
    static void mostrarFrase (String cartel, String frase){
        System.out.println(cartel +" "+ frase);
        }
}

 
    


