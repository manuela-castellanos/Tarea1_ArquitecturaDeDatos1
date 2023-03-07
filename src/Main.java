public class Main {
    public static void main(String[] args) {

        Estudiante est = new Estudiante("Daniela Castellanos Gil", "Carrera 3 # 6 - 55 Int 3 Cogua Cundinamarca", "Lenguas modernas", 4);
        System.out.println(est.toString());

        System.out.println();

        Profesor prof = new Profesor("Diego Andrés Gil Chibuque", "Calle 1 # 6 - 35 Cajicá Cundinamarca", "Idiomas", "Senior");
        System.out.println(prof.toString());
    }
}