import java.util.ArrayList;

public class SistemaNotas {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre, String cedula) {
        estudiantes.add(new Estudiante(nombre, cedula));
    }

    public Estudiante buscarEstudiante(String cedula) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    public void editarEstudiante(String cedula, String nuevoNombre) {
        Estudiante e = buscarEstudiante(cedula);
        if (e != null) {
            e.setNombre(nuevoNombre);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void mostrarEstadoEstudiante(String cedula) {
        Estudiante e = buscarEstudiante(cedula);
        if (e != null) {
            e.mostrarEstado();
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void agregarMateriaAEstudiante(String cedula, String nombre, String codigo, int creditos) {
        Estudiante e = buscarEstudiante(cedula);
        if (e != null) {
            e.agregarMateria(nombre, codigo, creditos);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    public void editarMateriaDeEstudiante(String cedula, String codigo, String nuevoNombre, int nuevosCreditos) {
        Estudiante e = buscarEstudiante(cedula);
        if (e != null) {
            e.editarMateria(codigo, nuevoNombre, nuevosCreditos);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
