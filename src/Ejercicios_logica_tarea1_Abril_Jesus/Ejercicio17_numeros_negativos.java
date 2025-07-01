//Ejercicio 17: Identificación de números negativos
//El usuario ingresará 15 números.
//Con un ciclo `for`, identificar cuántos de ellos son negativos.
//Mostrar cuántos valores negativos fueron ingresados.

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;
public class Ejercicio17_numeros_negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de valores a identificar : ");
        int n_numeros = sc.nextInt(); // Cambiado a nextInt()

        // Lectura de datos

        double[] valores = new double[n_numeros];

        for (int i = 0; i < n_numeros; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": a identificar : ");
            valores[i] = sc.nextDouble(); // Cambiado a nextDouble()
        }

        int contador_neg = 0;

        for (int i = 0; i < n_numeros; i++) {

            if (valores[i] < 0) {
                System.out.println("El número " + (i + 1) + ", tiene un valor negativo de : " + valores[i]);
                contador_neg = contador_neg + 1;
            }
        }
        System.out.println("SE HAN INGRESADO " + contador_neg + " VALORES NEGATIVOS");

    }
}
