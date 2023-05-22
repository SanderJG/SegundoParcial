

package Metodosdeordenamiento;

public class Shell {
  public static int Shell(int[] arreglo) {
    int n = arreglo.length;
    for (int mit = n/2; mit > 0; mit /= 2) {
        for (int i = mit; i < n; i += 1) {
            int temp = arreglo[i];
            int j;
            for (j = i; j >= mit && arreglo[j - mit] > temp; j = mit) {
                arreglo[j] = arreglo[j - mit];
            }
            arreglo[j] = temp;
        }
    }
     return n;
  }
  
}
