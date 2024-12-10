
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

    public void CargaAlum() {
        opcion = leer.nextInt();
        do {
            if (opcion == 1) {

                System.out.println("Ingrese el nombre del alumno: ");
                nombre = leer.nextLine();
                nombres.push(nombre);

                while (!leer.hasNextInt()) { // Validar entrada
                    System.out.println("Ingrese la edad del Alumno: ");
                    leer.next();
                }
                edad = leer.nextInt();
                edades.push(edad);

                System.out.println("Desea cargar otro alumno? 1(Si), 0 (No)");
                repetir = leer.nextInt();
            }
        } while (repetir == 1);

    }

    public void MostrarAlum() {

    }

    public void EliminarAlum() {

    }

    public void MostrarPilas() {
        opcion = leer.nextInt();
        if (opcion == 4) {
            System.out.println("Lista de Alumnos");
            for (int i = 0; i <= nombres.size(); i++) {
                System.out.println(nombres.get(i));
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("Bienvenido al sistema de gestion de alumnos ¿Que desea hacer?");
            System.out.println("1: Cargar un Alumno");
            System.out.println("2: Buscar un Alumno");
            System.out.println("3: Eliminar un Alumno");
            System.out.println("4: Mostrar a todos los Alumnos");

            Abm_Pilas Obj = new Abm_Pilas();
            Obj.CargaAlum();
            Obj.MostrarAlum();
            Obj.EliminarAlum();
            Obj.MostrarPilas();
        } while (repetir == 0);
    }

}
