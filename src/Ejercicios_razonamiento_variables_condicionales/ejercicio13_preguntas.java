//•	¿Cuál es la salida si se ingresa 50?
//        Código desordenado:
package Ejercicios_razonamiento_variables_condicionales;

import java.util.Scanner;//no existe el evento java.util.Scanner
public class ejercicio13_preguntas {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese valor: ");
        int valor = sc.nextInt();

        if (valor <= 100) {
            System.out.println("Dentro del rango");
        }

    }
}
