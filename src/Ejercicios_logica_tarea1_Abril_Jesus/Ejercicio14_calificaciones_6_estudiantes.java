//Ejercicio 14
//Se ingresan las calificaciones de 6 estudiantes.
// Mostrar cada una, calcular el promedio y decir si el grupo en general aprobó (promedio ≥ 7).

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;
public class Ejercicio14_calificaciones_6_estudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la calificación del estudiante 1 :");
        double calificacion1 = sc.nextDouble();

        System.out.println("Ingrese la calificación del estudiante 2 :");
        double calificacion2 = sc.nextDouble();

        System.out.println("Ingrese la calificación del estudiante 3 :");
        double calificacion3 = sc.nextDouble();

        System.out.println("Ingrese la calificación del estudiante 4 :");
        double calificacion4 = sc.nextDouble();

        System.out.println("Ingrese la calificación del estudiante 5 :");
        double calificacion5 = sc.nextDouble();

        System.out.println("Ingrese la calificación del estudiante 6 :");
        double calificacion6 = sc.nextDouble();

        double promedio = (calificacion1+calificacion2+calificacion3+calificacion4+calificacion5+calificacion6)/6;

        System.out.println("Calificación estudiante 1 :"+calificacion1);
        System.out.println("Calificación estudiante 2 :"+calificacion2);
        System.out.println("Calificación estudiante 3 :"+calificacion3);
        System.out.println("Calificación estudiante 4 :"+calificacion4);
        System.out.println("Calificación estudiante 5 :"+calificacion5);
        System.out.println("Calificación estudiante 6 :"+calificacion6);

        System.out.println("Promedio de los 6 estudiantes :"+promedio);

        if (promedio >= 7){
            System.out.println("El grupo de los 6 estudiantes tiene un promedio igual o mayor a 7; por lo que  el GRUPO APROBO");
        }
        else {
            System.out.println("El grupo de los 6 estudiantes tiene un promedio menor a 7; por lo que  el GRUPO NO APROBO");
        }
    }
}
