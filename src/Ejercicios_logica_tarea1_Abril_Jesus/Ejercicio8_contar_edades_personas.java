//Ejercicio 8
//Se registran las edades de 10 personas.
// El sistema debe contar cuántas son mayores de edad (18+)
// y mostrar un listado de las edades ingresadas.
// Además, mostrar la edad más alta y más baja.

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;

public class Ejercicio8_contar_edades_personas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int numero_p = sc.nextInt();

        String[] nombre_persona = new String[numero_p];
        int[] edad_persona = new int[numero_p]; // Cambié a int para manejar edades numéricas

        // Limpieza del buffer después de nextInt()
        sc.nextLine();

        for (int i = 0; i < numero_p; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombre_persona[i] = sc.nextLine();

            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edad_persona[i] = sc.nextInt();
            sc.nextLine(); // Limpiar buffer para la siguiente lectura de nombre
        }

        int contador_mayores_edad = 0;

        // Contar cuántas personas tienen 18 años o más
        for (int i = 0; i < numero_p; i++) {
            if (edad_persona[i] >= 18) {
                contador_mayores_edad++;
            }
        }

        // Inicializar edad_max y edad_min con la primera edad
        int edad_max = edad_persona[0];
        int edad_min = edad_persona[0];

        // Encontrar edad máxima y mínima
        for (int i = 1; i < numero_p; i++) {
            if (edad_persona[i] > edad_max) {
                edad_max = edad_persona[i];
            }
            if (edad_persona[i] < edad_min) {
                edad_min = edad_persona[i];
            }
        }

        System.out.println("\nLISTADO DE LAS EDADES INGRESADAS:");
        for (int i = 0; i < numero_p; i++) {
            System.out.println(nombre_persona[i] + " tiene " + edad_persona[i] + " años.");
        }

        System.out.println("\nCantidad de personas mayores o iguales a 18 años: " + contador_mayores_edad);
        System.out.println("La edad mínima ingresada es: " + edad_min);
        System.out.println("La edad máxima ingresada es: " + edad_max);

        sc.close();
    }
}