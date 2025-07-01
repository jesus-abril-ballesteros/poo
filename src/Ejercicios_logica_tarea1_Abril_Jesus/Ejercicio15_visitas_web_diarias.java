//Ejercicio 15: Visitas web diarias
//Enunciado claro para programar:
//Se registran las visitas a una página web durante 30 días.
//Usar un for para pedir al usuario que ingrese el número de visitas de cada día.
//Al final, mostrar la suma total y el promedio.
//Entrada esperada: 30 números (visitas por día)
//Estructura usada: for
//Salida esperada:
//•	Total de visitas del mes
//•	Promedio diario

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;

public class Ejercicio15_visitas_web_diarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] visitas = new int[30];

        for (int i = 0; i < 30; i++) {
            System.out.print("Ingrese el número de visitas del día " + (i + 1) + ": ");
            visitas[i] = sc.nextInt(); // Usar nextInt() para leer enteros correctamente
        }

        int suma = 0;
        for (int i = 0; i < 30; i++) {
            suma += visitas[i];
        }

        double promedio = (double) suma / 30; // Asegura la división decimal

        System.out.println("Total de visitas a la página web durante el mes: " + suma);
        System.out.println("Promedio diario de visitas a la página web: " + promedio);

        sc.close();
    }
}