class Persona {
    String nombre;
    int edad;

    public Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }
}

class Alumno extends Persona {
    public Alumno() {
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}

class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
}

public class Main {
    public static void main(String[] args) {
        Alumno a = new Alumno();
        Profesor p = new Profesor(10008000);
        System.out.println(a);
        System.out.println(p);
    }
}