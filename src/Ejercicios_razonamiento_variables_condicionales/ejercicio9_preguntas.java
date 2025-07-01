package Ejercicios_razonamiento_variables_condicionales;
import java.util.Scanner;//no existe el evento java.util.Scanner
public class ejercicio9_preguntas {
    public static void main(String[] args){// comienza el static void main (String[] args con el {

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese su clave: ");
    String clave = sc.nextLine();

   if (clave.equals("1234")) {
        System.out.println("Acceso permitido");
    }

}
}

