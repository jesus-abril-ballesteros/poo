
import java.util.Scanner;// Se importa a java.util.Scanner, mediante:
// import java.util.Scanner;
public class Tabla_multiplicar {
    public static void main(String[] args) {// comienza el static void main (String[] args con el {

    Scanner sc = new Scanner(System.in);//se crea el objeto registro con:
    //Scanner sc = new Scanner(System.in);
    System.out.println("INGRESE UN NUMERO");
    int num = sc.nextInt();

    int i;
    int multi;

    for(i=1;i<=12;i++){
        multi = num * i;
        System.out.println(num+"*"+i+" ="+ multi);
    }
}
}