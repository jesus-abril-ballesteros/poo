//Ejercicio 12
//Se desea mostrar todos los números pares del 1 al 100. Al final,
// se debe indicar cuántos pares se encontraron.

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;
public class Ejercicio12_numeros_pares_1_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("TABLA DE NUMEROS PARES");

        for (int i = 0; i < (101); i++) {

            if (i % 2 ==0.0) {
                System.out.println("Número par: "+ i);
                contador = contador + 1;
            }
        }
            System.out.println("EXISTEN " + contador + " NÚMEROS PARES " );


    }
}
