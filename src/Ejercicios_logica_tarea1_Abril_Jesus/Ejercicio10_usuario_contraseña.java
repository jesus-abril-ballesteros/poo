//Ejercicio 10
//Un sistema solicita al usuario que ingrese su nombre de usuario y contraseña.
// Si acierta  le muestra un mensaje de bienvenida.
// caso contrario Si falla UN MENSAJE que la información ingesada no es CORRECTA.

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;

public class Ejercicio10_usuario_contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario_i = "Jesús Abril";
        String contra_s_i = "A1@mesias.1234";

        System.out.print("Ingrese el nombre de usuario: ");
        String nombre_usuario = sc.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String contraseña = sc.nextLine();

        if (nombre_usuario.equals(usuario_i) && contraseña.equals(contra_s_i)) {
            System.out.print("BIENVENIDO: ");
        }
        else {
            System.out.print("El usuario o la contraseña es incorrecto ");
        }
    }
}
