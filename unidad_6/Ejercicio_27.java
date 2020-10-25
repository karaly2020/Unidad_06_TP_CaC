/* Crear un programa que pida su nombre al usuario y diga cuántas vocales y consonantes contiene 
(por ejemplo, “Aurora” tiene 4 vocales y 2 consonantes).*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_27 {
    public static void main(String[] args) {
        String nombre;
        int vocales, consonantes;
        
        nombre = leerNombre("Ingrese el nombre del usuario: ");
        vocales = BuscarVocales(nombre.toLowerCase());
        mostrarNombre("La cantidad de vocales es: " , vocales);
        consonantes = nombre.length()-vocales;
        System.out.println("La cantidad de consonantes es: " +consonantes);
    }
    static String leerNombre(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String nombre = entrada.nextLine();
        return nombre;
    }
    static int BuscarVocales (String cadena){
        int contador = 0;
        char letra;
        for(int i=0;i<cadena.length();i++) {
            letra = cadena.substring(i,i+1).charAt(0);
            if ((letra =='a')||(letra =='e')||(letra =='i')||(letra =='o')||(letra=='u')){
                contador++;
            }
        }
        return contador;
    }
    static void mostrarNombre(String cartel, int num){
        System.out.println(cartel +" "+ num);
    }
 }

 
    


