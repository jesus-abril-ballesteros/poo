//Ejercicio 11
//El usuario ingresa un número,
// y el sistema debe mostrar la tabla de multiplicar del 1 al 10 de ese número
// utilizando un ciclo for.

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;
public class Ejercicio11_tabla_multiplicar_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número a generar la tabla de multiplicar: ");
        int numero_p = sc.nextInt();

        int multiplicacion;

        System.out.println("TABLA DE MULTIPLICAR DEL NÚMERO: "+numero_p);

        for (int i = 0; i < (11); i++){

            multiplicacion = numero_p * i;

            System.out.println(numero_p+" x "+ i +" ="+multiplicacion );

        }

    }
}
