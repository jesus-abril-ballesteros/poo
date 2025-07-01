//Ejercicio 13
//El sistema solicita al usuario ingresar 5 números.
// Se debe acumular la suma de esos números y
// mostrar el total al final.

package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;
public class Ejercicio13_ingreso_5_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulado = 0;
        System.out.println("Ingrese el número 1 :");
        double numero1 = sc.nextDouble();
        acumulado = acumulado + numero1;

        System.out.println("Ingrese el número 2 :");
        double numero2 = sc.nextDouble();
        acumulado = acumulado + numero2;

        System.out.println("Ingrese el número 3 :");
        double numero3 = sc.nextDouble();
        acumulado = acumulado + numero3;

        System.out.println("Ingrese el número 4 :");
        double numero4 = sc.nextDouble();
        acumulado = acumulado + numero4;

        System.out.println("Ingrese el número 5 :");
        double numero5 = sc.nextDouble();
        acumulado = acumulado + numero5;

        double suma = numero1+numero2+numero3+numero4+numero5;

        System.out.println("Valor acumulado :"+acumulado);
        System.out.println("suma de los 5 números :"+suma);
    }
}
