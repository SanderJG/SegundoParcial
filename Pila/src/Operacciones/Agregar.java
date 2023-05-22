
package Operacciones;
import Tamaño_pila.tamaño_pila;
import java.util.Scanner;
public class Agregar {
     public static int agregarvalor(int B[],int i){
         Scanner leer = new Scanner (System.in);
         if (B[i]==0){
             for(i=0;i<B.length;i++){
                 System.out.println("ingresa un valor para llenar la pila");
               B[i]=leer.nextInt();
           }  
           
         }else {
            
         }
         return i;
     }
public static void agregarfin(int B[]){
    int val=agregarvalor(B,0);
    if (val==0){
        
    }
    else {
         System.out.println("La pila esta llena y es;");
          System.out.println("");
           for(int i=0;i<B.length;i++){
               System.out.println("["+B[i]+"]");
           } 
        
    }
}
 
}
     

