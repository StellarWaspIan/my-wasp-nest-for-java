
import java.util.Scanner;

public class MesaDeExamen {

    Scanner leer = new Scanner(System.in);

    /* Este es el examen final de PdA (Programacion de Algoritmos)
     * 
     * Crear un objeto docentes con los datos: Nombre, DNI, antiguedad y si es titular.
     * Crear un objeto "Mesa de examen" con los datos: fecha, asignatura, presidente, vocal1, vocal2, estado.
     * 
     * El programa debe permitir cargar docentes (Minimo 3).
     * El programa debe permitir crear mesas de examenes y asignar docentes como presidente, vocal1 y vocal2
     * 
     * Para ser presidente, un docente debe ser titular en un cargo.
     * 
     * me tienen re podrido
     * 
     */
    public class Docente { // aca estamos declarando la clase q guarda los objetos (que mierda se yo q significa eso)

        int id;
        String nombre;
        int dni;
        boolean es_titular;

        public Docente(int id, String nombre, int dni, boolean es_titular) { //este es el constructor, asi despues se crean objetos y se asignan a la clase (sigo sin entender que mierda es esto)
            this.id = id;
            this.nombre = nombre;
            this.dni = dni;
            this.es_titular = es_titular;
        }

    }

    public void CargaDocente() {

        String doc_nombre;
        int doc_dni;
        int op_titular;
        boolean doc_titular;

        System.out.println("Bienvenido a la carga de docentes");

        System.out.println("Introduzca el Nombre completo del Docente");
        doc_nombre = leer.nextLine();

        System.out.println("Introduzca el DNI del docente");
        doc_dni = leer.nextInt();

        System.out.println("¿Es titular en algun cargo? 1(Si) o 0(No)");
        op_titular = leer.nextInt();

        switch (op_titular) {
            case 0 ->
                doc_titular = false;
            case 1 ->
                doc_titular = true;
            default ->
                System.out.println("Ingrese una opcion valida.");
        }
    }
}
