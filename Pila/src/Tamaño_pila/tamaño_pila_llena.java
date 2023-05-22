
package Tamaño_pila;

public class tamaño_pila_llena {
    public static void llena(int B[]){
         for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100); // genera numeros de 0 a 1 se pasa a int
        }
        System.out.println("");
        System.out.println("La pila desordenado es:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("[" + B[i] + "]");
        }
        System.out.println("");
         for ( int i = 0; i < B.length; i++) {
             int lugar = i;
             int aux = B[i];
            while ((lugar > 0 && (B[lugar - 1] > aux))) {
                B[lugar] = B[lugar - 1];
                lugar--;
            }
            B[lugar] = aux;
        }
        System.out.println("");
        System.out.println("La Pila por insercion de menor a mayor es:");
        for ( int orden:  B) {
            System.out.print("[" + orden+ "], ");
             try{
            Thread.sleep(700);
                    }catch(Exception e){
                        
                    }
        }
        
        System.out.println("");
    }
    
}
