
package Metodos;

import MetodosdeBuscqueda.Binaria;
import MetodosdeBuscqueda.Secuencial;
import java.util.Scanner;

public class Buscar {
 public static void Metodo_Buscar(int B[]) {

        Scanner leer = new Scanner(System.in);
        int op;

        do {
            System.out.println("\tPor que metodo quiere realizar su busqueda");
            System.out.println("1.-  \t Busqueda secuencial:");
            System.out.println("2.- \t Busqueda binaria:");
            System.out.println("3.-\t ninguna busqueda ingresa un numero mayor a 3 (salir):");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    Secuencial.secuencial(B);
                    break;
                case 2:
                    Binaria.binaria(B);
                    break;
                default:
                    System.out.println("Sali00 de la busqueda");
                    break;
            }
        } while (op <= 3);

 }
}
