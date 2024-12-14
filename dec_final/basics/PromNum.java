
import java.util.Scanner;

public class PromNum {

    static void prom_num() {
        int cant;
        double suma_num = 0;
        double prom;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a promediar:");
        cant = leer.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el numero " + i + " a promediar:");
            suma_num = leer.nextInt() + suma_num;
        }
        prom = suma_num / cant;
        System.out.println("El promedio de los " + cant + " numeros ingresados es: " + prom);
        leer.close();
    }

    public static void main(String[] args) {
        prom_num();
    }

}
