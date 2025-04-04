import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String cedula;
    private ArrayList<Materia> materias;

    public Estudiante(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(String nombre, String codigo, int creditos) {
        materias.add(new Materia(nombre, codigo, creditos));
    }

    public void editarMateria(String codigo, String nuevoNombre, int nuevosCreditos) {
        for (Materia m : materias) {
            if (m.getCodigo().equals(codigo)) {
                m.setNombre(nuevoNombre);
                m.setCreditos(nuevosCreditos);
                return;
            }
        }
        System.out.println("Materia no encontrada.");
    }

    public void mostrarEstado() {
        System.out.println("Estudiante: " + nombre + " - Cédula: " + cedula);
        if (materias.isEmpty()) {
            System.out.println("  No tiene materias registradas.");
        } else {
            System.out.println("  Materias:");
            System.out.printf("  %-20s %-10s %-10s %-12s%n", "Nombre", "Código", "Créditos", "Estado");
            System.out.println("  --------------------------------------------------------------");
            for (Materia m : materias) {
                String estado = (m.getCreditos() >= 3) ? "Aprobado" : "No aprobado";
                System.out.printf("  %-20s %-10s %-10d %-12s%n", m.getNombre(), m.getCodigo(), m.getCreditos(), estado);
            }
        }
    }
}
