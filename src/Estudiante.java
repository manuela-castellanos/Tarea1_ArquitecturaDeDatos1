public class Estudiante extends Persona{
    protected String carrera;
    protected int semestre;

    public Estudiante() {
    }

    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + " - Estudiante {" +
                "carrera = '" + carrera + '\'' +
                ", semestre = " + semestre +
                '}';
    }
}
