/*Desarrollar un algoritmo que, dado un número entero de entre 2 y 4 dígitos, la computadora indique si 
es capicúa. Ayuda: Detectar la cantidad de cifras del número. Si se ingresa como cadena, basta con saber la
longitud, luego extraer cada cifra con funciones de cadena y hacer las respectivas comparaciones. 
Si se ingresa como entero, basta saber en qué rango de números está, luego extraer cada cifra usando descomposición
matemática y hacer las respectivas comparaciones. Ejemplo: Ingresa 1881, debe imprimir “Es capicúa”..*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_24 {
    public static void main(String[] args) {
        String cadena;
        cadena = leerPalabra("Ingrese la cadena entre 2 y 4 digitos: ");
        
        if (validarPalabra(cadena)== 0){
            System.out.println("La cadena ingresada es no se encuentra entre 2 y 4 digitos");
        }
        else {
            if (evaluarCapicua(cadena)== 0){
            System.out.println("La cadena no es capicua");
            }
            else {
            System.out.println("La cadena es capicua");
            }
         }
    }
    static String leerPalabra (String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        String palabra = entrada.nextLine();
        return palabra;
    }
    static int validarPalabra (String palab) {
        if (palab.length()>4 || (palab.length()<2)){
            return 0;
        }
        else{
            return 1;
        }
    }
    static int evaluarCapicua (String palab) {
        int hasta, numero = 0;
        int longitud = palab.length();
        String letra1, letra2;
        hasta = (int)Math.floor(longitud/2) -1;
        for ( int i=0; i<=hasta; i++){
            letra1 = palab.substring(i, i+1);
            letra2 = palab.substring(longitud-i-1, longitud-i);
            if (letra1.equals(letra2)){
                numero = 1;
            }
            else{
                numero = 0;
                break;
            }
        }
        return numero; 
    }
}

 
    


