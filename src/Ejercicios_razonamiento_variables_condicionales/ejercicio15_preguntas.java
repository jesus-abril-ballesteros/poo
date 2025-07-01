//•	¿Qué está mal si se desea mostrar “Acceso denegado” si el número ingresado es menor a 0?
//Código desordenado:

package Ejercicios_razonamiento_variables_condicionales;

import java.util.Scanner;//no existe el evento java.util.Scanner
public class ejercicio15_preguntas {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num;
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Acceso denegado");

        }


    }
}
