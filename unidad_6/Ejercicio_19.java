/*Array de 2 dimensiones. Una escuela tiene un total de 3 aulas con la siguiente capacidad: Sabiendo 
la cantidad de bancos de cada aula, el usuario deberá ingresar la cantidad de alumnos inscriptos para 
cursar tercer grado y el sistema deberá determinar qué aula (Azul, Verde o Amarillo) es la indicada para la
cantidad ingresada. La escuela ya sabe que la máxima capacidad de sus aulas es de 40 alumnos, por lo tanto, 
la cantidad de alumnos inscriptos que ingresa el usuario siempre será un número menor o igual a 40. Se
espera que el aula asignada sea la que deje menos bancos libres.
 */
package unidad_6;
import java.util.Scanner;
public class Ejercicio_19 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        int cantidadAlumnos;
        int posicion;
        String aulas []= {"Azul", "Verde", "Amarillo"};
        int alumnos []= {40, 35, 30};
        
        cantidadAlumnos = leerNumero("Ingrese la cantidad de alumnos:");
        
        if (cantidadAlumnos > 40){
            System.out.println("La cantidad de alumnos supera el espacio disponible");
        }
            else{
            posicion = evaluaAula (cantidadAlumnos, alumnos);
            System.out.println("El aula seleccionada es " +aulas[posicion]+ " y sobran " + 
            (alumnos[posicion]-cantidadAlumnos));
            }
    } 
        static int evaluaAula (int cantidadAlumnos, int [] alumnos) {
        int aula = 0;
        for (int i=(alumnos.length-1); i>=0; i--){
            if (alumnos[i] >= cantidadAlumnos){
                aula = i;
                break;
            }
        }
        return aula;
        }
        static int leerNumero(String cartel) {
        Scanner entrada = new Scanner (System.in);
        System.out.println(cartel);
        int x = entrada.nextInt();
        return (int) x ;
        }
}
