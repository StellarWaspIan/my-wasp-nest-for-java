
import java.util.Scanner;
import java.util.Stack;

public class Abm_Pilas {

    String nombre;
    int edad;
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
        System.out.println("0: Salir");
    }

    public void CargaAlum() {

        do {
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = leer.nextLine();

            System.out.println("Ingrese la edad del alumno: ");
            edad = Integer.parseInt(leer.nextLine());

            nombres.push(nombre);
            edades.push(edad);

            System.out.println("¿Desea cargar otro alumno? 1 (Sí), 0 (No):");
            repetir = Integer.parseInt(leer.nextLine());

        } while (repetir == 1);
    }

    public void MostrarAlum() {
        String nombre;
        do {
            System.out.println("Ingrese el nombre del alumno a buscar: ");
            nombre = leer.nextLine();

            for (int i = 0; i <= nombres.size(); i++) {
                if (nombre.equals(nombres.get(i))) {
                    System.out.println(i + ". Nombre: " + nombres.get(i) + ", Edad: " + edades.get(i));
                }
            }
            System.out.println("¿Desea cargar otro alumno? 1 (Sí), 0 (No):");
            repetir = Integer.parseInt(leer.nextLine());
        } while (repetir == 1);

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void EliminarAlum() {
        do {
            int opcion_elim;
            String alum_elim;
            int id_elim;
            System.out.println("Seleccione el metodo de eliminacion. 1 (Eliminar por nombre), 2 (Eliminar por ID)");
            opcion_elim = leer.nextInt();

            switch (opcion_elim) {

                case 1 -> {
                    leer.nextLine();

                    System.out.println("Ingrese el nombre del alumno a eliminar (Sensible a Mayusculas): ");
                    alum_elim = leer.nextLine();

                    boolean alumnoEncontrado = false;

                    Stack<String> auxNombres = new Stack<>();
                    Stack<Integer> auxEdades = new Stack<>();

                    while (!nombres.isEmpty()) {
                        String nombreActual = nombres.pop();
                        int edadActual = edades.pop();

                        if (nombreActual.equals(alum_elim)) {
                            System.out.println("Se eliminó al Alumno: " + nombreActual);
                            alumnoEncontrado = true;
                            break;
                        }

                        auxNombres.push(nombreActual);
                        auxEdades.push(edadActual);
                    }

                    if (!alumnoEncontrado) {
                        System.out.println("El alumno no existe.");
                    }

                    while (!auxNombres.isEmpty()) {
                        nombres.push(auxNombres.pop());
                        edades.push(auxEdades.pop());
                    }
                }
                case 2 -> {
                    leer.nextLine();

                    Stack<String> auxNombresid = new Stack<>();
                    Stack<Integer> auxEdadesid = new Stack<>();

                    System.out.println("Ingrese el ID del alumno a eliminar: ");
                    id_elim = leer.nextInt();

                    int contador = 0;
                    boolean idEncontrado = false;

                    while (!nombres.isEmpty()) {
                        String nombreActual = nombres.pop();
                        int edadActual = edades.pop();
                        contador++;
                        if (id_elim == contador) {
                            System.out.println("Se eliminó al Alumno: " + nombreActual);
                            idEncontrado = true;
                            break;
                        }

                        auxNombresid.push(nombreActual);
                        auxEdadesid.push(edadActual);
                    }
                    if (!idEncontrado) {
                        System.out.println("El alumno no existe.");
                    }

                    while (!auxNombresid.isEmpty()) {
                        nombres.push(auxNombresid.pop());
                        edades.push(auxEdadesid.pop());
                    }
                }
                default ->
                    System.out.println("Opción no válida.");
            }
            System.out.println("¿Desea eliminar otro alumno? 1(Si), 0(No)");
            repetir = leer.nextInt();
        } while (repetir == 1);
    }

    public void MostrarPilas() {
        System.out.println("Lista de Alumnos");
        if (nombres.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("Lista de Alumnos:");
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println(i + ". Nombre: " + nombres.get(i) + ", Edad: " + edades.get(i));
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
                case 1 ->
                    Obj.CargaAlum();
                case 2 ->
                    Obj.MostrarAlum();
                case 3 ->
                    Obj.EliminarAlum();
                case 4 ->
                    Obj.MostrarPilas();
                case 0 ->
                    System.out.println("Adios");
                default ->
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

    }

}
