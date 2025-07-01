//•	¿Qué pasa si se ingresa 18?
//        Código desordenado:

package Ejercicios_razonamiento_variables_condicionales;

import java.util.Scanner;//no existe el evento java.util.Scanner
public class ejercicio12_preguntas {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Puede votar");
        }
    }
}
