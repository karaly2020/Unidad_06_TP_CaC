/* Crear un arreglo de n posiciones y llenarlo con nombres de personas */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones = 0;
        System.out.print("Ingrese la cantidad de nombres que quiere guardar en el arreglo:");
        posiciones = entrada.nextInt();
        String [] nombres = crearArregloDeNombres(posiciones);
        System.out.println("El arreglo queda:");
        mostrarArreglo(nombres);
        }
    static void mostrarArreglo (String[]nom){
        
        for (int i= 0; i<nom.length; i++){
        System.out.print(nom[i] + " ");
        }
        System.out.println(" ");
    }
    static String[] crearArregloDeNombres(int tamano){
        String[] nom = new String[tamano];
        
        for (int i = 0; i < nom.length; i++) {
        nom[i] = leerNombre("Nombre " + (i+1) + " de " + nom.length + ": ");
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