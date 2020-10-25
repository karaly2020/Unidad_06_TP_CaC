/* Diseñar un algoritmo que recorra las butacas de una sala de cine y determine cuántas butacas desocupadas
hay en la sala. Suponga que inicialmente tiene un array (arreglo) con valores booleanos que si es verdadero
implica que está ocupada y si es falso la butaca está desocupada. Tenga en cuenta que el array deberá
ser creado e inicializado al principio del algoritmo.*/
package unidad_6;
import java.util.Scanner;
public class Ejercicio_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean butacas []= new boolean [6];
        boolean cine [][];
        int butacasVacias;
        int filas, columnas;
        butacas [0] = false;
        butacas [1] = false;
        butacas [2] = true;
        butacas [3] = true;
        butacas [4] = false;
        butacas [5] = false;

        filas = leerNumero("Ingrese un numero para definir el numero de filas de la matriz:");
        columnas = leerNumero("Ingrese un numero para definir el numero de columnas de la matriz:");
       
        cine = crearMatrizDeCine(butacas, filas, columnas);
        mostrarMatriz(cine);
        butacasVacias = ContarMatriz(cine);
        System.out.println("La sala tiene : " + (filas * columnas) + " sillas de las cuales " + butacasVacias + " están vacías");
        }
  
    static void mostrarMatriz (boolean [][]num){
        for (int i= 0; i<num.length; i++){
            for (int j= 0; j <num[i].length; j++){
                System.out.print(num[i][j] + " ");
            }
        System.out.println(" ");
        }
    }
    static int ContarMatriz (boolean [][]num){
        int v_butacas_vacias = 0;
        for (int i= 0; i<num.length; i++){
            for (int j= 0; j <num[i].length; j++){
                if (num[i][j] == false) {
                    v_butacas_vacias ++;
                }
            }
        }
        return v_butacas_vacias;
    }    
    static boolean [][] crearMatrizDeCine(boolean [] p_butacas, int filas, int columnas){
        int contador = 0;
        boolean [][] matriz = new boolean [filas][columnas];
        boolean v_valor;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = evaluaEspacio(contador, p_butacas);
                contador ++;
            }
        }
        return matriz;
    }
    static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        int x = entrada.nextInt();
        return (int) x ;
    }
    static boolean evaluaEspacio (int puesto, boolean [] arreglo) {
        boolean evalua;
        int resto;
        resto = puesto%arreglo.length;
        evalua = arreglo[resto];
        return evalua;
    }
}