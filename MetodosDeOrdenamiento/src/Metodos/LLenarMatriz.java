
package Metodos;

import java.util.Random;


public class LLenarMatriz {
    public static int [] Llenado(int m){
        int [] arreglo = new int [m];
       Random ramdon =new Random ();
       
       for(int i=0; i<m;i++){
         
           arreglo [i]=ramdon.nextInt(100) ;  
           
       }
return arreglo;
       
    }
}
