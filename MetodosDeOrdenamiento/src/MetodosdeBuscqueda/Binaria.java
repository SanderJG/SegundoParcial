
package MetodosdeBuscqueda;

import java.util.Scanner;

public class Binaria {
 public static void binaria(int B[]){
        Scanner leer = new Scanner (System.in);
         System.out.println("ingrese el elemento a buscar");
        int bus=leer.nextInt();
    int val=operaccion(B,bus,0,0,0);
    if (val==-1){
        System.out.println("el numero no se encuentra");
    }else {
        System.out.println("el numero: " + bus + " se enecuentra en el lugar: " +val+ " del arreglo");

    }
        System.out.println("");
    }
    public static int operaccion(int B[],int bus,int izquierda, int derecha, int medio){
        izquierda=0;
        derecha=B.length-1;
        while (izquierda<=derecha){
            medio=(izquierda+derecha)/2;
            if (B[medio]==bus){
                return medio;
            }else if (B[medio]<bus){
                izquierda=medio+1;
            }else {
                derecha=medio-1;
            }
        }
        return -1;
    }
}
