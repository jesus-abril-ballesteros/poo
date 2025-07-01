//Ejercicio 2: Cálculo de edad y tabla de multiplicar.
//Parte A: Edad actual: solicitar el nombre de un cliente y su año de nacimiento.
// Calcular su edad con base en el año actual, (año constante).
//Parte B: Tabla de multiplicar. Mostrar los primeros 4 resultados de la tabla de multiplicar del número 5
// utilizando un ciclo for.

package Clase3;// Se crea un paquete. package Clase3

import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;

public class calculo_edad_tabla_multiplicar {//comienza public class calculo_edad_tabla_multiplicar con el {
    public static void main(String[] args){// comienza el static void main (String[] args con el {

        Scanner registro = new Scanner(System.in);//se crea el objeto registro con:
        //Scanner registro = new Scanner(System.in);
        //no olvidarse del ;

        System.out.println("REGISTRE EL NOMBRE DEL CLIENTE");//se usa System.out.println("REGISTRE EL NOMBRE DEL CLIENTE");
        //System.out = para sacar a consola el label:"REGISTRE EL NOMBRE DEL CLIENTE"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;

        String Cliente=registro.nextLine();
        //Variable Cliente tipo String
        //no olvidarse que String comienza con capital letter (mayuscula)
        //A la variable Cliente se le asigna: registro.nextLine();
        // se usa nextLine();, porque se trata de una variable String
        //no olvidarse del ;

        System.out.println("REGISTRE EL A#O DE NACIMIENTO");
        //se usa System.out.println("REGISTRE EL A#O DE NACIMIENTO");
        //System.out = para sacar a consola el label:"REGISTRE EL A#O DE NACIMIENTO"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;

        int anio=registro.nextInt();
        //Variable anio tipo entero
        //A la variable anio se le asigna: registro.nextLine();
        // se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        int Edad_actual = 2025-anio;
        //Variable Edad_actual tipo entero
        //A la variable Edad_actual se le asigna el cálculo: 2025-anio;
        //no olvidarse del ;

        System.out.println(Cliente + " TIENE: "+Edad_actual+" A#OS");

    }
}
