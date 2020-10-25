/* Escribir un programa en Java para realizar la búsqueda del nombre de un cliente en un vector que contiene
5 clientes en total. El cliente a buscar será ingresado por pantalla por el usuario. El algoritmo deberá devolver,
en caso de que ese nombre exista, la posición en donde se encuentra dicho cliente dentro del vector.*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones = 5, posicionCliente;
        String nombreCliente;
        
        String [] clientes = crearArregloDeClientes(posiciones);
        System.out.println("Ingrese el nombre del cliente que quiere ubicar en el arreglo:");
        nombreCliente = entrada.nextLine();
        posicionCliente = buscarPosicionCliente (nombreCliente, clientes);
        
        if (posicionCliente == 0){
            System.out.println("El Cliente no existe");
        }
        else{
            System.out.println("El cliente esta en la posicion: " + posicionCliente);
        }
    }
    static String[] crearArregloDeClientes(int tamano){
        String[] nom = new String[tamano];
        
        for (int i = 0; i < nom.length; i++) {
            
        nom[i] = leerNombre("Cliente " + (i+1) + " de " + nom.length + ": ");
        }
        return nom;
    }
    static int buscarPosicionCliente(String cliente, String [] clientes){
        int posicion = 0, x = 0; 
        
        for (String i:clientes) {
            x++;
            if (cliente.equals(i)){
                posicion = x;
            }
        }
        return posicion;
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        String nombre = entrada.nextLine();
        return nombre;
    }
}