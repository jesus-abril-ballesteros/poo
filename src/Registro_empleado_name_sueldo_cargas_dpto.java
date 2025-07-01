/* 1. Registro de empleado
Desarrolla un programa que solicite al usuario ingresar
la siguiente información de un empleado: nombre completo, sueldo mensual,
número de cargas familiares y departamento en el que trabaja.
*/

package Deber2;// Se crea un paquete. package Deber2
import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;

public class Registro_empleado_name_sueldo_cargas_dpto {//comienza public class Ejerc3_calculo_t_ventas con el {

    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner registro = new Scanner(System.in);//se crea el objeto registro con:
        //Scanner registro = new Scanner(System.in);
        //no olvidarse del ;

        System.out.println("INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL EMPLEADO");
        //se usa System.out.println("INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL EMPLEADO");
        //System.out = para sacar a consola el label:"INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL EMPLEADO"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        String nombre_empleado =registro.nextLine();
        //Variable nombre_empleado tipo caracter
        //A la variable nombre_empleado se le asigna: registro.nextLine();
        //se usa nextLine();, porque se trata de una variable string
        //no olvidarse del ;


        System.out.println("INGRESE EL SUELDO MENSUAL DEL EMPLEADO");
        //se usa System.out.println("INGRESE EL SUELDO MENSUAL DEL EMPLEADO");
        //System.out = para sacar a consola el label:"INGRESE EL SUELDO MENSUAL DEL EMPLEADO"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        double sueldo_empleado =registro.nextDouble();
        //Variable sueldo_empleado tipo decimal
        //A la variable nombre_empleado se le asigna: registro.nextDouble();
        //se usa nextDouble();, porque se trata de una variable decimal
        //no olvidarse del ;

        System.out.println("INGRESE EL NÚMERO DE CARGAS FAMILIARES");
        //se usa System.out.println("INGRESE EL NÚMERO DE CARGAS FAMILIARES");
        //System.out = para sacar a consola el label:"INGRESE EL NÚMERO DE CARGAS FAMILIARES"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        int numero_c_familiares =registro.nextInt();
        //Variable numero_c_familiares tipo entero
        //A la variable numero_c_familiares se le asigna: registro.nextInt();
        //se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;



        System.out.println("INGRESE EL DEPARTAMENTO EN EL QUE TRABAJA");
        //se usa System.out.println("INGRESE EL DEPARTAMENTO EN EL QUE TRABAJA");
        //System.out = para sacar a consola el label:"INGRESE EL DEPARTAMENTO EN EL QUE TRABAJA"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        String departamento_t =registro.nextLine();
        //Variable departamento_t tipo string
        //A la variable departamento_t se le asigna: registro.nextLine();
        //se usa nextLine();, porque se trata de una variable caracter
        //no olvidarse del ;
    }
}
