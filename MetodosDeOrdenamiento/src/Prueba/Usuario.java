package Prueba;

import Metodos.LLenarMatriz;
import java.util.Scanner;
import Metodos.Buscar;
import Metodosdeordenamiento.hanoi;

public class Usuario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int m;
        int op;
        System.out.println("Tamaño de casillas");
        m = leer.nextInt();

        int[] arreglo = LLenarMatriz.Llenado(m);
        for (int i = 0; i < m; i++) {

            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        System.out.println("Seleccione el metodo de ordenamiento");
        System.out.println("\t1. Burbuja:");
        System.out.println("\t2. Seleccion:");
        System.out.println("\t3. Insercion:");
        System.out.println("\t4. Shell");
        System.out.println("\t5. Quicksort");
        System.out.println("\t6. Ackermann");
        System.out.println("\t7. Hanoi");
        System.out.println("Opcion:  ");

        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                Metodosdeordenamiento.MetodoBurbuja.burbuja(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
            case 2:
                Metodosdeordenamiento.Seleccion.Seleccion(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
            case 3:
                Metodosdeordenamiento.Inserccion.inserccion(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
            case 4:
                Metodosdeordenamiento.Shell.Shell(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
            case 5:
                Metodosdeordenamiento.QuickSort.sort(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
                 case 6:
                Metodosdeordenamiento.ackermann.acker(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
                 case 7:
                     Metodosdeordenamiento.hanoi.soluccion(arreglo);
                try {
                    Thread.sleep(700);
                } catch (Exception e) {

                }
                Buscar.Metodo_Buscar(arreglo);
                break;
            default:
                System.out.println("Error opcion no valida");

        }
        System.out.println("Arreglo ordenado");

        for (int i = 0; i < m; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

}
