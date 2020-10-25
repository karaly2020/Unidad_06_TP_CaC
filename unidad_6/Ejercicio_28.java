/* Crear un programa que pida una frase al usuario y diga cuántas palabras contiene 
(pista: puedes contar los espacios, prestando atención en que no estén repetidos).*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_28 {
    public static void main(String[] args) {
        String frase;
        int palabras;
        frase = leerFrase("Ingrese una frase: ");
        palabras = ContarPalabras(frase);
        System.out.println("La cantidad de palabras de la frase es: " +palabras);
    }
    static String leerFrase(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String frase = entrada.nextLine();
        return frase;
    }
    static int ContarPalabras (String cadena){
        int contador = 0;
        String letra;
        for(int i=0;i<cadena.length();i++) {
            letra = cadena.substring(i,i+1);
            if (letra.equals(" ")){
                contador++;
            }
        }
        contador++;
        return contador;
    }
    static void mostrarNombre(String cartel, int num){
        System.out.println(cartel +" "+ num);
    }
}

 
    


