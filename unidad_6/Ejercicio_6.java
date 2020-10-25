/* Crear un arreglo de n posiciones y llenarlo con los números que el usuario desee y luego busque 
en el array un número ingresado por teclado. */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int posiciones = 0, valor = 0;
        int posicion;
        
        System.out.println("Ingrese la cantidad de numeros que quiere guardar en el arreglo:");
        posiciones = entrada.nextInt();
        int [] numeros = crearArregloDeNumeros(posiciones);
        System.out.println("El arreglo queda:");
        mostrarArreglo(numeros);
        
        System.out.println("Digite el numero que desea buscar");
        valor = entrada.nextInt();
        posicion = buscarNumero(valor, numeros);
        
        if (posicion == 0){
            System.out.println("El numero no esta en el arreglo");
        }
        else{
            System.out.println("El numero " + valor +  " esta en la posicion: " +posicion);
        }
    }
    static void mostrarArreglo (int[]num){
        
        for (int i= 0; i<num.length; i++){
        System.out.print(num[i] + " ");
        }
        System.out.println(" ");
    }
    static int[] crearArregloDeNumeros(int tamano){
        int[] num = new int[tamano];
        
        for (int i = 0; i < num.length; i++) {
            
        num[i] = leerNumero("Valor " + (i+1) + " de " + num.length + ": ");
        }
        return num;
    }
    static int buscarNumero(int valor, int []p_arreglo){
        int posicion = 0;
        
        for (int i = 0; i < p_arreglo.length; i++) {
            
            if (p_arreglo [i] == valor){
                posicion = i+1;
            }
        }
        return posicion;
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.print(cartel);
        
        int numero = entrada.nextInt();
        return numero;
    }
}