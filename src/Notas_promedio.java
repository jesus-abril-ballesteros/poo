/*3. Evaluación de nota promedio
Diseña un programa que permita ingresar una nota promedio entre 0 y 10.
El sistema debe verificar si la nota está en el rango válido y
determinar si el estudiante aprobó (nota de 7 a 10) o reprobó (nota menor a 7).
*/

import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;

public class Notas_promedio {//comienza public class Ejerc3_calculo_t_ventas con el {

    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner registro = new Scanner(System.in);//se crea el objeto registro con:
        //Scanner registro = new Scanner(System.in);
        //no olvidarse del ;

        System.out.println("INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL ESTUDIANTE");
        //se usa System.out.println("INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL ESTUDIANTE");
        //System.out = para sacar a consola el label:"INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL ESTUDIANTE"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        String nombre_estudiante =registro.nextLine();
        //Variable nombre_estudiante tipo caracter
        //A la variable nombre_estudiante se le asigna: registro.nextLine();
        //se usa nextLine();, porque se trata de una variable string
        //no olvidarse del ;


        System.out.println("INGRESE LA NOTA DEL ESTUDIANTE");
        //se usa System.out.println("INGRESE LA NOTA DEL ESTUDIANTE");
        //System.out = para sacar a consola el label:"INGRESE LA NOTA DEL ESTUDIANTE"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        double nota_estudiante =registro.nextDouble();
        //Variable nota_estudiante tipo decimal
        //A la variable nota_estudiante se le asigna: registro.nextDouble();
        //se usa nextDouble();, porque se trata de una variable decimal
        //no olvidarse del ;

        if (nota_estudiante < 0 || nota_estudiante > 10) {
            System.out.println("El rango de la nota es 0 a 10. REGISTRE UNA NOTA VALIDA");
        }
        if (nota_estudiante >= 7 || nota_estudiante >= 10) {
            System.out.println("El estudiante " + nombre_estudiante + " APROBO");
        }
        else {System.out.println("El estudiante " + nombre_estudiante + " NO APROBO");
        }


    }
}
