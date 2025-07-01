/*2. Verificación de mayoría de edad
Crea un programa que pida al usuario ingresar su nombre y edad.
Luego, el sistema debe verificar si la persona es mayor de edad (18 años o más)
e imprimir un mensaje correspondiente.
 */

package Deber2;// Se crea un paquete. package Deber2
import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;

public class Verificación_mayoria_edad {//comienza public class Ejerc3_calculo_t_ventas con el {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner registro = new Scanner(System.in);//se crea el objeto registro con:
        //Scanner registro = new Scanner(System.in);
        //no olvidarse del ;

        System.out.println("INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL USUARIO");
        //se usa System.out.println("INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL USUARIO");
        //System.out = para sacar a consola el label:"INGRESE LOS NOMBRES Y APELLIDOS COMPLETOS DEL USUARIO"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        String nombre_usuario =registro.nextLine();
        //Variable nombre_usuario tipo caracter
        //A la variable nombre_usuario se le asigna: registro.nextLine();
        //se usa nextLine();, porque se trata de una variable string
        //no olvidarse del ;

        System.out.println("REGISTRE LA EDAD DEL USUARIO");
        //se usa System.out.println("REGISTRE LA EDAD DEL USUARIO");
        //System.out = para sacar a consola el label:"REGISTRE LA EDAD DEL USUARIO"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        int edad=registro.nextInt();
        //Variable edad tipo entero
        //A la variable edad se le asigna: registro.nextLine();
        // se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        if (edad >= 18) {
            System.out.println("El usuario " + nombre_usuario + " es mayor de edad");
        }
        else {System.out.println("El usuario " + nombre_usuario + " NO es mayor de edad");
        }
        }
    }

