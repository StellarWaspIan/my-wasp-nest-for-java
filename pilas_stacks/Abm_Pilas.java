
import java.util.Scanner;
import java.util.Stack;

public class Abm_Pilas {

    String nombre;
    int edad;
    int opcion = 0;
    int repetir = 0;

    Scanner leer = new Scanner(System.in);
    Stack<String> nombres = new Stack<>();
    Stack<Integer> edades = new Stack<>();

    public void Menu() {
        System.out.println("Bienvenido al sistema de gestion de alumnos ¿Que desea hacer?");
        System.out.println("1: Cargar un Alumno");
        System.out.println("2: Buscar un Alumno");
        System.out.println("3: Eliminar un Alumno");
        System.out.println("4: Mostrar a todos los Alumnos");

    }

    public void CargaAlum() {

        do {

            System.out.println("Ingrese el nombre del alumno: ");
            nombre = leer.nextLine();
            nombres.push(nombre);

            System.out.println("Ingrese la edad del Alumno: ");
            while (!leer.hasNextInt()) { // Validar entrada

                leer.next();
            }
            edad = leer.nextInt();
            edades.push(edad);

            System.out.println("Desea cargar otro alumno? 1(Si), 0 (No)");
            repetir = leer.nextInt();
        } while (repetir == 1);
    }

    public void MostrarAlum() {

    }

    public void EliminarAlum() {

    }

    public void MostrarPilas() {
        System.out.println("Lista de Alumnos");
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("Lista de Alumnos:");
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println("Nombre: " + nombres.get(i) + ", Edad: " + edades.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Abm_Pilas Obj = new Abm_Pilas();
        int opcion;
        do {
            Obj.Menu();
            opcion = Obj.leer.nextInt();
            Obj.leer.nextLine();
            switch (opcion) {
                case 1:
                    Obj.CargaAlum();
                    break;
                case 2:
                    Obj.MostrarAlum();
                    break;
                case 3:
                    Obj.EliminarAlum();
                    break;
                case 4:
                    Obj.MostrarPilas();
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

    }

}
