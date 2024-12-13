//NOT FINISHHHHHHHHHHHHHHHHHHHHHHH
import java.util.LinkedList;
//import java.util.Queue;
import java.util.Scanner;

public class ABM_Colas {

    Scanner leer = new Scanner(System.in);
    LinkedList<Integer> cola = new LinkedList<>();

    static void Menu() {
        System.out.println("Bienvenido al Sistema de Alumnos");
        System.out.println("1: Ingresar Alumno.");
        System.out.println("2: Buscar Alumno.");
        System.out.println("3: Eliminar Alumno.");
        System.out.println("4: Mostrar Alumnos.");
        System.out.println("0: Salir.");

    }

    public static void main(String[] args) {
        ABM_Colas obj = new ABM_Colas();

        int opcion;
        do {
            Menu();
            opcion = obj.leer.nextInt();

        } while (opcion != 0);
    }
}
