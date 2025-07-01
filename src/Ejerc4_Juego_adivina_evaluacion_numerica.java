//Ejercicio 4: Juego de adivinanzas y evaluación numérica.
//Parte A: Capital del Ecuador. Mostrar las siguientes opciones: Babahoyo, Guayaquil, Cuenca, Quito, Ambato.
// El usuario debe ingresar su respuesta. Si escribe correctamente “Quito”, se muestra un mensaje de acierto.
//Parte B. Verificar valor positivo o negativo.
// Solicitar un número y determinar si es positivo, negativo o cero, utilizando condicional if

import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;

public class Ejerc4_Juego_adivina_evaluacion_numerica {//comienza public class Ejerc4_Juego_adivina_evaluacion_numerica con el {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {

        Scanner registro = new Scanner(System.in);//se crea el objeto registro con:
        //Scanner registro = new Scanner(System.in);
        //no olvidarse del ;

        System.out.println("ADIVINANZA DE LA CAPITAL DEL ECUADOR");
        System.out.println("1. Babahoyo");
        System.out.println("2. Guayaquil");
        System.out.println("3. Cuenca");
        System.out.println("4. Quito");
        System.out.println("5. Ambato");


        System.out.println("INGRESE EL NÚMERO QUE INDICA LA OPCIÓN DE LA CAPITAL DEL ECUADOR");
        //se usa System.out.println("INGRESE EL NÚMERO QUE INDICA LA OPCIÓN DE LA CAPITAL DEL ECUADOR");
        //System.out = para sacar a consola el label:"INGRESE EL NÚMERO QUE INDICA LA OPCIÓN DE LA CAPITAL DEL ECUADOR"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        int numero_opcion =registro.nextInt();
        //Variable numero_opcion tipo entero
        //A la variable numero_opcion se le asigna: registro.nextInt();
        //se usa nextInt();, porque se trata de una variable entera
        //no olvidarse del ;

        if (numero_opcion == 4) {System.out.println("Quito es la capital del Ecuador");
        }
        else {System.out.println("El número de la opción señala una ciudad que NO ES la capital del Ecuador");
        }

        //PARTE B: Parte B. Verificar valor positivo, negativo o cero.
        // Solicitar un número y determinar si es positivo, negativo o cero, utilizando condicional if.

        System.out.println("INGRESE UN NÚMERO REAL");
        //se usa System.out.println("INGRESE UN NÚMERO REAL");
        //System.out = para sacar a consola el label:"INGRESE UN NÚMERO REAL"
        //println() = para imprimir en otra linea, salto de página
        //no olvidarse del ;
        double numero_real =registro.nextDouble();
        //Variable numero_real tipo flotante
        //A la variable numero_real se le asigna: registro.nextDouble();
        //se usa nextDouble();, porque se trata de una variable con punto flotante
        //no olvidarse del ;

        double cero_00 = 0.0;

        if (numero_real < cero_00) {
            System.out.println("El número ingresado es MENOR que cero");
        }
        if (numero_real == cero_00) {
            System.out.println("El número ingresado es CERO");
        }
        if (numero_real > cero_00) {
            System.out.println("El número ingresado es MAYOR que cero");
        }
    }
}
