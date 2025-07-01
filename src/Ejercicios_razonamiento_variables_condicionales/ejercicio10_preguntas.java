
//•	¿Cuál es el error si se desea verificar si un número es mayor que 100?
//        Código desordenado:

package Ejercicios_razonamiento_variables_condicionales;

import java.util.Scanner;//no existe el evento java.util.Scanner
public class ejercicio10_preguntas {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        if (num > 100) {
            System.out.println("Mayor que 100");
        }

    }
}
