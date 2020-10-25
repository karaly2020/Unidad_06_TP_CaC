package unidad_6;
public class examen {
      private static void intercambiar(int[] a, int i, int j) {

           int temp;

           temp = a[i];

           a[i] = a[j];

           a[j] =  temp ;

     }
     private static void burbuja(int[] a) {

           int n = a.length;

           for (int i = 0; i <= n - 2; i++)

                for (int j = n - 1; j > i; j--)

                     if (a[j - 1] > a[j])

                           intercambiar (a, j - 1, j);

     }

     public static void main(String[] args) {

           int[] vector = { 1, 0, 4, 3, 5, 10, 8, 9, 2, 6, 7 };

            burbuja (vector);
     }
}