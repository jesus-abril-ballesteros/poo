//Ejercicio 16: Lectura de registros de sensores
//Se tienen lecturas de 50 sensores en tiempo real.
//Usar un `for` para ingresar cada valor de lectura.
//Mostrar cuántos sensores están fuera de rango (valor > 100 o valor < 0).

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;

public class Ejercicio16_registro_sensores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de sensores : ");
        int n_sensores = sc.nextInt(); // Cambiado a nextInt()

        double[] lectura = new double[n_sensores];
        int contador_f_rango = 0;
        int contador_m_cero = 0;

        // Lectura de datos
        for (int i = 0; i < n_sensores; i++) {
            System.out.print("Ingrese la lectura del sensor " + (i + 1) + ": ");
            lectura[i] = sc.nextDouble(); // Cambiado a nextDouble()
        }

        // Procesamiento de datos
        for (int i = 0; i < n_sensores; i++) {
            if (lectura[i] > 100) {
                System.out.println("El sensor " + (i + 1) + ": ESTA FUERA DE RANGO");
                System.out.println("TIENE UN VALOR DE: " + lectura[i]);
                contador_f_rango++;
            }
            else if (lectura[i] < 0) {
                System.out.println("El sensor " + (i + 1) + ": TIENE UN VALOR MENOR QUE CERO");
                System.out.println("TIENE UN VALOR DE: " + lectura[i]);
                contador_m_cero++;
            }
        }

        // Resultados finales
        System.out.println("\nRESUMEN FINAL:");
        System.out.println("NÚMERO DE SENSORES FUERA DE RANGO (> 100): " + contador_f_rango);
        System.out.println("NÚMERO DE SENSORES MENORES DE CERO (< 0): " + contador_m_cero);

        sc.close();
    }
}