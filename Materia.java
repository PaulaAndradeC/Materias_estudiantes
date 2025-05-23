public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
