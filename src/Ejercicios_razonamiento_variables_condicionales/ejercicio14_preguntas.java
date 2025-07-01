//•	¿Qué pasa si el usuario ingresa “admin”?
//        Código desordenado:

package Ejercicios_razonamiento_variables_condicionales;

import java.util.Scanner;//no existe el evento java.util.Scanner
public class ejercicio14_preguntas {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String usuario = sc.nextLine();

        if (usuario.equals("admin")) {
            System.out.println("Bienvenido");
        }

    }
}
