//Ejercicio 9
//Un estudiante realiza 4 exámenes.
// Si su promedio es mayor o igual a 7 y no tuvo ninguna nota menor a 4,
// aprueba el curso. Caso contrario, reprueba.
// Mostrar el promedio y el resultado.

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;

public class Ejercicio9_4_examenes_aprobar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numero_e = sc.nextInt();

        String[] nombre_estudiante = new String[numero_e];
        double[] nota_e1 = new double[numero_e];
        double[] nota_e2 = new double[numero_e];
        double[] nota_e3 = new double[numero_e];
        double[] nota_e4 = new double[numero_e];

        sc.nextLine(); // Limpiar buffer después de nextInt()

        for (int i = 0; i < numero_e; i++) {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre_estudiante[i] = sc.nextLine();

            System.out.print("Ingrese la nota 1: ");
            nota_e1[i] = sc.nextDouble();
            System.out.print("Ingrese la nota 2: ");
            nota_e2[i] = sc.nextDouble();
            System.out.print("Ingrese la nota 3: ");
            nota_e3[i] = sc.nextDouble();
            System.out.print("Ingrese la nota 4: ");
            nota_e4[i] = sc.nextDouble();

            sc.nextLine(); // Limpiar buffer para la siguiente lectura de nombre
        }

        for (int i = 0; i < numero_e; i++) {
            // Calcular promedio correctamente sumando las 4 notas
            double promedio = (nota_e1[i] + nota_e2[i] + nota_e3[i] + nota_e4[i]) / 4;

            // Verificar si cada nota es >= 4
            boolean habilitado1 = nota_e1[i] >= 4;
            boolean habilitado2 = nota_e2[i] >= 4;
            boolean habilitado3 = nota_e3[i] >= 4;
            boolean habilitado4 = nota_e4[i] >= 4;

            // Condición para aprobar: promedio >= 7 y todas las notas habilitadas
            if (promedio >= 7 && habilitado1 && habilitado2 && habilitado3 && habilitado4) {
                System.out.println("El estudiante " + nombre_estudiante[i] + " APROBÓ");
            } else {
                System.out.println("El estudiante " + nombre_estudiante[i] + " NO APROBÓ");
            }
        }

        sc.close();
    }
}