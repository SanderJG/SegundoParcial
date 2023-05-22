
package Metodosdeordenamiento;




public class Seleccion {

public static int[] Seleccion(int arreglo[]) {
   int n = arreglo.length;
   for (int i=0;i<n-1;i++){
       int min=i;
       for(int j=i+1;j<n;j++){
           if (arreglo[j]<arreglo[min]){
               min=j;
           }
       }
       int temp= arreglo[min];
       arreglo[min]=arreglo[i];
       arreglo[i]=temp;
   }
    return arreglo;
}
}

        
    


