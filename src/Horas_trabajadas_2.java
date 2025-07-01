// Ejercicio número 1: registro de asistencia con asignación combinada.
// Solicitar el nombre del empleado y el total de horas asistidas previamente.
// Luego, ingresar las horas asistidas en el día actual y sumar estas horas al total
// utilizando el operador "+="

package HoraTrabajo;// Se crea un paquete. package HoraTrabajo
import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
                        // import java.util.Scanner;

public class Horas_trabajadas_2 {//comienza public class Horas_trabajadas_2 con el {
    public static void main(String[] args){// comienza el static void main (String[] args con el {

        Scanner ingreso = new Scanner(System.in);//se crea el objeto ingreso con:
                                                //Scanner ingreso = new Scanner(System.in);
                                                //no olvidarse del ;
        System.out.println("INGRESE SU NOMBRE");//se usa System.out.println("INGRESE SU NOMBRE");
                                                //System.out = para sacar a consola el label:"INGRESE SU NOMBRE"
                                                //println() = para imprimir en otra linea, salto de página
                                                //no olvidarse del ;

        String NomEmpleado = ingreso.nextLine();//Variable NomEmpleado tipo String
                                                //no olvidarse que String comienza con capital letter (mayuscula)
                                                //A la variable NomEmpleado se le asigna: ingreso.nextLine();
                                                // se usa nextLine();, porque se trata de una variable String
                                                //no olvidarse del ;

        System.out.println("HORAS TRABAJADAS EN DIAS ANTERIORES");
        //se usa System.out.println("HORAS TRABAJADAS EN DIAS ANTERIORES");
        //System.out = para sacar a consola el label:"HORAS TRABAJADAS EN DIAS ANTERIORES"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;

        int H_asistidas_p= ingreso.nextInt();
        //Variable H_asistidas_p tipo int
        //A la variable H_asistidas_p se le asigna: ingreso.nextInt();
        // se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        System.out.println("HORAS TRABAJADAS EN EL DIA DE HOY");
        //se usa System.out.println("HORAS TRABAJADAS EN EL DIA DE HOY");
        //System.out = para sacar a consola el label:"HORAS TRABAJADAS EN EL DIA DE HOY"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;

        int H_asistidas_a= ingreso.nextInt();
        //Variable H_asistidas_a tipo int
        //A la variable H_asistidas_a se le asigna: ingreso.nextInt();
        // se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        int TotalHTrabajadas = H_asistidas_p+H_asistidas_a;
        //Variable TotalHTrabajadas tipo int
        //TotalHTrabajadas = H_asistidas_p+H_asistidas_a, tipo int;
       //no olvidarse del ;

        System.out.print("EL TOTAL DE LAS HORAS TRABAJADAS SON :"+TotalHTrabajadas);
        //se usa System.out.println("EL TOTAL DE LAS HORAS TRABAJADAS SON :"+TotalHTrabajadas);
        //System.out = para sacar a consola el label:"EL TOTAL DE LAS HORAS TRABAJADAS SON :"
        //También se añade con + la variable calculada TotalHTrabajadas
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;


    }
}
