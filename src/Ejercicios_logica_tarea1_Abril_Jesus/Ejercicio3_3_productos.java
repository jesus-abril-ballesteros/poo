//Ejercicio 3
//Una persona compra 3 productos con precios distintos.
//Se desea calcular el total y
// aplicar un 10% de descuento si el total supera los 100.
package Ejercicios_logica_tarea1_Abril_Jesus;
import java.util.Scanner;

public class Ejercicio3_3_productos {//comienza el evento public class

    public static void main(String[] args) {// comienza el evento static void main (String[] args con el {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de productos: ");
        int numero_p = sc.nextInt();

        String[] productos = new String[numero_p];
        double[] precios = new double[numero_p];

        for (int i = 0; i < (numero_p); i++){
            System.out.println("Ingrese el producto "+(i+1)+" : ");
            productos[i] = sc.next();// con sc.next(), hace el pare para el ingreso del producto.
                                    //no se uso sc.nextLine()

            System.out.println("Ingrese el precio del producto "+(i+1)+" : ");
            precios[i] = sc.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < (numero_p); i++) {
            suma = suma + precios[i];
        }
        double descuento = 0;

        if (suma >= 100.0) {
            descuento = 0.1*suma;
        }

        double costo_t = suma - descuento;

        System.out.println("\nResumen de la compra:");
        for (int i = 0; i < (numero_p); i++) {
            System.out.println("Producto: " + productos[i] + " - Precio: $" + precios[i]);
        }

        System.out.print("Costo sin descuento : "+suma);
        System.out.print("Descuento : "+descuento);
        System.out.print("Costo con descuento : "+costo_t);
    }
}
