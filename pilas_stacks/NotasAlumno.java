
import java.util.Scanner;
import java.util.Stack;

public class NotasAlumno {

    static void notasalumno() {

        String alumno;
        int cantexam, nota, repetir = 0, max = 0, min = 10;
        double promedio = 0;

        Scanner leer = new Scanner(System.in);
        Stack<Integer> examenes = new Stack<>();

        do {
            System.out.println("Ingrese el Nombre del Alumno");
            alumno = leer.nextLine();
            System.out.println("Ingrese la cantidad de examenes: ");
            cantexam = leer.nextInt();

            if (cantexam > 0) {

                for (int i = 0; i < cantexam; i++) {
                    System.out.println("Ingrese la nota del examen " + i);
                    nota = leer.nextInt();
                    examenes.push(nota);
                    if (nota >= max) {
                        max = nota;
                    }
                    if (nota <= min) {
                        min = nota;
                    }
                    promedio = (nota + promedio);
                }
                promedio = promedio / cantexam;
                System.out.println("El alumno " + alumno + " tiene un promedio de: " + promedio);
                System.out.println("Sus notas en los examenes son: ");
                for (int i = 0; i < cantexam; i++) {
                    System.out.println("Examen " + i + ": " + examenes.get(i));
                }
                System.out.println("La nota mas alta es de: " + max);
                System.out.println("La nota mas baja es de: " + min);

                if (promedio >= 7) {
                    System.out.println("El alumno ha aprobado!!!!!!!");
                } else {
                    System.out.println("El alumno ha desaprobado :(");
                }

                System.out.println("¿Desea repetir la operacion? 1(Si) y 0(No)");
                repetir = leer.nextInt();
            }
        } while (repetir == 1);
    }

    public static void main(String[] args) {
        notasalumno();
    }
}
