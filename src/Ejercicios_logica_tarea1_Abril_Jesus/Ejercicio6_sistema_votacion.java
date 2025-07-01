//Ejercicio 6
//Un sistema de votación verifica si una persona puede votar.
//Para hacerlo, debe tener al menos 16 años y presentar su cédula.
// Si cumple ambas condiciones, puede votar. Si no, se indica el motivo

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;

public class Ejercicio6_sistema_votacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.print("Edad de la persona: ");
        int edad = sc.nextInt();

        System.out.print("Ha presentado la cédula [si/no]: ");
        String cedula_s_n = sc.next().toLowerCase(); // Convertir a minúsculas para comparar

        // Para comparar Strings en Java se usa .equals(), no ==
        // También, la condición lógica correcta es que la persona debe tener 16 años o más
        // Y debe haber presentado la cédula ("si")

        if (edad >= 16 && cedula_s_n.equals("si")) {
            System.out.println("El ciudadano: " + nombre + " ESTÁ HABILITADO PARA VOTAR");
        } else {
            System.out.println("El ciudadano: " + nombre + " NO ESTÁ HABILITADO PARA VOTAR");
            System.out.println("PORQUE NO TIENE 16 AÑOS O NO HA PRESENTADO LA CÉDULA");
        }
        sc.close(); // Cerrar el Scanner para evitar fugas de recursos
    }
}