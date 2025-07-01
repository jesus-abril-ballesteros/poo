//Ejercicio 3: Cálculo del total de ventas.
//Ingresar el número de clientes que realizan compras en línea y los que compran en tienda física.
//Calcular y mostrar el total general de ventas combinadas.

import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;

public class Ejerc3_calculo_t_ventas {//comienza public class Ejerc3_calculo_t_ventas con el {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {

        Scanner registro = new Scanner(System.in);//se crea el objeto registro con:
        //Scanner registro = new Scanner(System.in);
        //no olvidarse del ;

        System.out.println("REGISTRE EL NUMERO DE CLIENTES EN LINEA");
        //se usa System.out.println("REGISTRE EL NUMERO DE CLIENTE EN LINEA");
        //System.out = para sacar a consola el label:"REGISTRE EL NUMERO DE CLIENTE EN LINEA"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        int numero_cl_l =registro.nextInt();
        //Variable numero_cl_l tipo entero
        //A la variable numero_cl_l se le asigna: registro.nextLine();
        //se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        System.out.println("REGISTRE EL NUMERO DE CLIENTE EN TIENDA FÍSICA");
        //se usa System.out.println("REGISTRE EL NUMERO DE CLIENTE EN TIENDA FÍSICA");
        //System.out = para sacar a consola el label:"REGISTRE EL NUMERO DE CLIENTE EN TIENDA FÍSICA"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        int numero_cl_t_f =registro.nextInt();
        //Variable numero_cl_t_f tipo entero
        //A la variable numero_cl_t_f se le asigna: registro.nextLine();
        // se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        System.out.println("REGISTRE EL TOTAL DE VENTAS EN LINEA");
        //se usa System.out.println("REGISTRE EL TOTAL DE VENTAS EN LINEA");
        //System.out = para sacar a consola el label:"REGISTRE EL NUMERO DE CLIENTE EN LINEA"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        double ventas_t_l =registro.nextDouble();
        //Variable ventas_t_l tipo flotante
        //A la variable ventas_t_l se le asigna: registro.nextLine();
        //se usa nextDouble();, porque se trata de una variable flotante
        //no olvidarse del ;



        System.out.println("REGISTRE EL TOTAL DE VENTAS EN TIENDA FÍSICA");
        //se usa System.out.println("REGISTRE EL TOTAL DE VENTAS EN TIENDA FÍSICA");
        //System.out = para sacar a consola el label:"REGISTRE EL TOTAL DE VENTAS EN TIENDA FÍSICA"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        double ventas_t_t_f =registro.nextDouble();
        //Variable ventas_t_t_f tipo flotante
        //A la variable ventas_t_t_f se le asigna: registro.nextLine();
        //se usa nextDouble();, porque se trata de una variable flotante
        //no olvidarse del ;

        double Total_ventas = ventas_t_l+ventas_t_t_f;
        //Variable Total_ventas tipo double
        //Total_ventas = ventas_t_l+ventas_t_t_f, tipo double;
        //no olvidarse del ;

        System.out.println(" NUMERO DE VENTAS EN LINEA: "+numero_cl_l);
        System.out.println(" NUMERO DE VENTAS EN TIENDAS FÍSICAS: "+numero_cl_t_f);
        System.out.println(" TOTAL DE VENTAS EN LÍNEA: "+ventas_t_l);
        System.out.println(" TOTAL DE VENTAS EN TIENDAS FÍSICAS: "+ventas_t_t_f);
        System.out.println(" TOTAL DE VENTAS EN LÍNEA Y EN TIENDAS FÍSICAS: "+Total_ventas);
    }
}