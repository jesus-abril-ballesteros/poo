//Ejercicio 1
//Un estudiante tiene una calificación inicial de 14.
//Si su asistencia supera el 80%, se le suman 2 puntos.
// Para aprobar necesita mínimo 16 puntos finales

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;//no existe el evento java.util.Scanner
public class Ejercicio1_calificación_14 {//comienza el evento public class
    public static void main(String[] args){// comienza el evento static void main (String[] args con el {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Calificación inicial: ");
        double calificacion_i = sc.nextDouble();

        System.out.print("Porcentaje de asistencia: ");
        double porcentaje_a = sc.nextDouble();

        double calificacion_a;

        if (porcentaje_a >= 80) {
            calificacion_a = 2.0;
        }
            else {
            calificacion_a = 0.0;
        }

            double calificacion = calificacion_i + calificacion_a;

        if (calificacion >= 16.0) {
            System.out.print("El estudiante: "+nombre+" APROBO");
        }
        else {
            System.out.print("El estudiante: "+nombre+" NO APROBO");
        }
    }
}
