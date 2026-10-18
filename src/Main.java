class Per {
    String nombre;
    int edad;

    public Per() {
        nombre = "Sin nombre";
        edad = 0;
    }
}

class Al extends Per {
    public Al() {
        System.out.println("Se crea Alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + nombre;
    }
}

class Prof extends Per {
    private int numEmpleado;

    public Prof(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
}

public class Main {
    public static void main(String[] args) {
        Al a = new Al();
        Prof p = new Prof(10008000);
        System.out.println(a);
        System.out.println(p);
    }
}