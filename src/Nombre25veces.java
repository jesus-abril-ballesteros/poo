//programa para repetir el nombre 25 veces

import java.util.Scanner;

public class Nombre25veces {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        int i;
        for (i = 1; i <= 25; i++){
            System.out.println(nombre);
        }

    }
}
