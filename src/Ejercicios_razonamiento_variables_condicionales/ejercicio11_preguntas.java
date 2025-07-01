//•	¿Qué pasa si se ingresa “n”?
//        Código desordenado:

package Ejercicios_razonamiento_variables_condicionales;
import java.util.Scanner;//no existe el evento java.util.Scanner

public class ejercicio11_preguntas {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Desea continuar? (s/n): ");
        String resp = sc.next();
        if (resp.equals("s")) {
            System.out.println("Continuar");
        }

    }
}
