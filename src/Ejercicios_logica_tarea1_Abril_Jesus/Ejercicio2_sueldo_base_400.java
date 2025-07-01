//Ejercicio 2
//Un trabajador gana un sueldo base de 400.
// Por cada hora extra trabajada gana 10 adicionales.
// Debe calcularse el sueldo total si trabajó 5 horas extras.


package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;

public class Ejercicio2_sueldo_base_400 {//comienza el evento public class

    public static void main(String[] args) {// comienza el evento static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el sueldo base del trabajador: ");
        double sueldo = sc.nextDouble();

        System.out.print("Ingrese el número de horas extras trabajadas: ");
        double horas_ex = sc.nextDouble();

        double sueldo_h_e = horas_ex * 10;

        double sueldo_total = sueldo + sueldo_h_e;

        System.out.print("El sueldo total es: " + sueldo_total);
    }
}
