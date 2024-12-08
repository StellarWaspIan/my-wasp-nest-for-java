
import java.util.Scanner;

public class FactNum {

    static void fact_num() {

        int num;
        double factorial = 1;
        int repetir = 0;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese el numero para calcular el factorial: ");
            num = leer.nextInt();

            if (num >= 0) {
                for (int i = 1; i <= num; i++) {
                    factorial = factorial * i;
                }
                System.out.println("El factorial de " + num + " es: " + factorial);
                System.out.println("Desea repetir? 1(Si), 0(No)");
                repetir = leer.nextInt();
            }
        } while (repetir == 1);
        leer.close();
    }

    public static void main(String[] args) {
        fact_num();

    }
}
