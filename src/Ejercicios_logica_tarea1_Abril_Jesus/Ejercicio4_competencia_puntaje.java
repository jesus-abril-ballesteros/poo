//Ejercicio 4
// En una competencia, cada participante recibe un puntaje.
// Si el puntaje es mayor o igual a 80, gana medalla.
// Si no, queda como finalista.

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;
public class Ejercicio4_competencia_puntaje {//comienza el evento public class

    public static void main(String[] args) {// comienza el evento static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de participantes: ");
        int numero_p = sc.nextInt();

        String[] participante = new String[numero_p];
        double[] puntaje = new double[numero_p];

        for (int i = 0; i < (numero_p); i++) {
            System.out.println("Ingrese el nombre del participante " + (i + 1) + " : ");
            participante[i] = sc.next();// con sc.next(), hace el pare para el ingreso del producto.
            //no se uso sc.nextLine()

            System.out.println("Ingrese el puntaje del participante " + (i + 1) + " : ");
            puntaje[i] = sc.nextDouble();
        }
        for (int i = 0; i < (numero_p); i++) {
            if (puntaje[i] >= 80) {
                System.out.println("El participante " + participante[i]+
                        "# "+(i + 1) + " : GANA MEDALLA");
            }
            else {
                System.out.println("El participante " + participante[i]+
                        "# "+(i + 1) + " : NO GANA MEDALLA Y QUEDA COMO FINALISTA");
            }
        }
    }

}
