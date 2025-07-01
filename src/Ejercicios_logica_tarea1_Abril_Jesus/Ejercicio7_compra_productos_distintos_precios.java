//Ejercicio 7
//En una tienda, un cliente compra productos con distintos precios.
// Si el total supera $150, se le aplica un 15% de descuento y
// si paga con tarjeta se suma una comisión del 2%. Calcular el monto final.

package Ejercicios_logica_tarea1_Abril_Jesus;

import java.util.Scanner;

public class Ejercicio7_compra_productos_distintos_precios {
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
    double descuento;
        descuento = 0;
    if (suma >= 150.0) {
        descuento = 0.15*suma;
    }

    System.out.println("Opción de pago : ");
    System.out.println("1. Efectivo ");
    System.out.println("2. Tarjeta ");
    System.out.println("Selecciones la opción de pago [1/2]: ");
    int opcion_pago = sc.nextInt();

    double comision;

    if (opcion_pago == 1) {
            comision = 0.0;
        }
    else {
            comision = 0.02 * suma;
        }
    double costo_t = suma - descuento + comision;

    System.out.println("\nResumen de la compra:");
    for (int i = 0; i < (numero_p); i++) {
        System.out.println("Producto: " + productos[i] + " - Precio: $" + precios[i]);
    }

    System.out.println("Costo sin descuento : "+suma);
    System.out.println("Descuento : "+descuento);
    System.out.println("Comisión : "+comision);
    System.out.println("Costo con descuento y comision : "+costo_t);
   }
}


