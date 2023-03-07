public class Profesor extends Persona{

    protected String departamento;
    protected String categoria;

    public Profesor() {
    }

    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " - Profesor {" +
                "departamento = '" + departamento + '\'' +
                ", categoria = '" + categoria + '\'' +
                '}';
    }
}