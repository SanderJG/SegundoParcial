
package Metodosdeordenamiento;
import static Variables.variables.i;
import static Variables.variables.j;

public class hanoi {
    public static void soluccion(int A[]){
        System.out.println("El arreglo ordenado por hanoi es:");
        hanoii(A,0,A.length-1);
        for(int orden: A){
            System.out.print("["+orden+"],");
             try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
        }
        System.out.println("");
    }
    
    public static void hanoii(int A[], int inicial, int fin){
        if (inicial<fin){
            int mitad = (inicial+fin)/2;
            hanoii(A,inicial,mitad);
            hanoii(A,mitad+1,fin);
            ordena(A,inicial,mitad,fin);
        }
    }
    public static void ordena(int A[], int inicial, int mitad, int fin){
        int aux[]= new int [fin-inicial+1];
        i=inicial;
        j=mitad+1;
        int p=0;
        while (i<=mitad && j<=fin){
            if (A[i]<=A[j]){
                aux[p++]=A[i++];
            }else{
                aux[p++]=A[j++];
            }
        }
        while (i<=mitad){
           aux[p++]=A[i++]; 
        }
        while (j<=fin){
            aux[p++]=A[j++];
            
        }
        for(p=0;p<aux.length;p++){
            A[inicial+p]=aux[p];
        }
        
    }
    
}
