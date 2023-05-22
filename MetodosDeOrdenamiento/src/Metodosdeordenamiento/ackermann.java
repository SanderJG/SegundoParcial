package Metodosdeordenamiento;


import static Variables.variables.*;
public class ackermann {
    public static void mostrar(int A[]){
        System.out.println("El arreglo ordenado por Ackermann es:");
          for(int orden: A){
           System.out.print("["+orden+"],");
            try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
       }
          System.out.println("");
    }
    public static int v(int m, int n){
        if (m==0){
            return n+1;
        }else if (n==0){
            return v(m-1,1);
        }
        else {
            return v(m-1,v(m,n-1));
        }
    }
   public static void acker(int A[]){
      
       int Arr[]=new int[A.length];
       for(i=0;i<A.length;i++){
           Arr[i]=v(A[i],2);
       }
       for(i=0;i<A.length-1;i++){
           minimo=i;
           for(j=i+1;j<A.length;j++){
               minimo=j;
             if(Arr[j]<Arr[minimo]){
                 minimo=j;
             }
           }
           int t=A[i];
           A[i]=A[minimo];
           A[minimo]=t;
          
           }
       }
}
      
    
     
   
    

