
package MetodosdeBuscqueda;

import java.util.Scanner;

public class Secuencial {
public static void secuencial(int B[]){
         Scanner leer = new Scanner(System.in);
        System.out.println("ingresa el numero que desea buscar");
     int bus = leer.nextInt();
        int val = busqued(B,bus);
        if (val == -1) {
            
            System.out.println("el numero:" + bus + "no se encuentra");

        } else {
            
            System.out.println("el numero: " + bus + " se enecuentra en el lugar: " +val+ " del arreglo");
        } 
    }
        public static int busqued(int B[],int bus){
       
        for (int i = 0; i < B.length; i++) {
            if (B[i] == bus) {
               

                return i;
            }

        }
        return -1;
    }

    }
