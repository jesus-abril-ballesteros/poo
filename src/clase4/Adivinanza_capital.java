
import java.util.Scanner;
public class Adivinanza_capital {
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);

        System.out.println("INGRESE lA CAPITAL");
        String capital=ingreso.nextLine();

        if(capital == "QUITO"){
            System.out.println("ES LA CAPITAL DEL ECUADOR");
        }
        else{ System.out.println("NO ES LA CAPITAL, INGRESE LA CAPITAL");
        }

    }
}
