package ejerciciopila;

import Operacciones.Agregar;
import Operacciones.Buscar;
import Operacciones.Eliminar;
import Tamaño_pila.tamaño_pila;
import Tamaño_pila.tamaño_pila_llena;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EjercicioPILA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la pila"));

        int B[] = new int[elemento];
        System.out.println("\tSELECCIONA COMO QUIERE LA PILA");
        System.out.println("\t1.-Vacio");
        System.out.println("\t2.-Llena");

        int op = leer.nextInt();
        if (op == 1) {
            tamaño_pila.tamaño_pila(B);
            System.out.println("");
            
            Agregar.agregarfin(B);
            System.out.println("");
            
            Buscar.buscar(B);
            System.out.println("");
            
            Eliminar.eliminar(B);
            System.out.println("");
            
        } else {
            tamaño_pila_llena.llena(B);
            System.out.println("");
            
            Agregar.agregarfin(B);
            System.out.println("");
            
            Buscar.buscar(B);
            System.out.println("");
            
            Eliminar.eliminar(B);
            System.out.println("");
        }

    }
}
