import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaNotas sistema = new SistemaNotas();
        int opcion;

        do {
            System.out.println("\n===== Menú Principal =====");
            System.out.println("1. Crear estudiante");
            System.out.println("2. Editar estudiante");
            System.out.println("3. Agregar materia a estudiante");
            System.out.println("4. Editar materia de estudiante");
            System.out.println("5. Ver estado de estudiante");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombreEst = scanner.nextLine();
                    System.out.print("Cédula del estudiante: ");
                    String cedulaEst = scanner.nextLine();
                    sistema.agregarEstudiante(nombreEst, cedulaEst);
                    break;
                case 2:
                    System.out.print("Cédula del estudiante a editar: ");
                    String cedulaEdit = scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombreEst = scanner.nextLine();
                    sistema.editarEstudiante(cedulaEdit, nuevoNombreEst);
                    break;
                case 3:
                    System.out.print("Cédula del estudiante: ");
                    String cedulaMat = scanner.nextLine();
                    System.out.print("Nombre de la materia: ");
                    String nombreMat = scanner.nextLine();
                    System.out.print("Código de la materia: ");
                    String codigoMat = scanner.nextLine();
                    System.out.print("Créditos: ");
                    int creditos = scanner.nextInt();
                    scanner.nextLine();
                    sistema.agregarMateriaAEstudiante(cedulaMat, nombreMat, codigoMat, creditos);
                    break;
                case 4:
                    System.out.print("Cédula del estudiante: ");
                    String cedulaMod = scanner.nextLine();
                    System.out.print("Código de la materia a editar: ");
                    String codigoEdit = scanner.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevos créditos: ");
                    int nuevosCreditos = scanner.nextInt();
                    scanner.nextLine();
                    sistema.editarMateriaDeEstudiante(cedulaMod, codigoEdit, nuevoNombre, nuevosCreditos);
                    break;
                case 5:
                    System.out.print("Cédula del estudiante: ");
                    String cedulaVer = scanner.nextLine();
                    sistema.mostrarEstadoEstudiante(cedulaVer);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
