/* Almacenar en un arreglo de n posiciones nombres de países. Implementar
una opción que al digitar una posición muestre el dato que contiene. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones, posicionPais;
        System.out.println("Ingrese la cantidad de paises que quiere guardar en el arreglo:");
        posiciones = entrada.nextInt();
        String [] paises = crearArregloDePaises(posiciones);
        
        System.out.println("Ingrese la posicion que quiere ubicar en el arreglo:");
        posicionPais = entrada.nextInt();
        
        System.out.println("El pais en la posicion " + (posicionPais) + " es: " + paises[posicionPais-1]);
        }
    static String[] crearArregloDePaises(int tamano){
        String[] nom = new String[tamano];
        
        for (int i = 0; i < nom.length; i++) {
        nom[i] = leerNombre("Pais " + (i+1) + " de " + nom.length + ": ");
        }
        return nom;
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        
        String nombre = entrada.nextLine();
        return nombre;
    }
}