//Ejercicio 5
//Se deben imprimir los números del 1 al 10 y calcular su suma total.

        package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;
public class Ejercicio5_suma_1_10 {//comienza el evento public class

    public static void main(String[] args) {// comienza el evento static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        int numero_f = 10;
        int suma = 0;

        for (int i = 0; i < (numero_f); i++) {
            suma = suma + (i + 1);
        }
        System.out.println("Números del 1 al 10: ");
        for (int i = 0; i < (numero_f); i++) {
            System.out.println((i + 1));
        }
        System.out.println("SUMA de los números del 1 al 10 = "+suma);

    }
}

