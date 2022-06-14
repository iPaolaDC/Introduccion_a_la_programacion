public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Paola");
        persona. setEdad(34);
        persona.setTelefono(56336788);

        System.out.println("Mi nombre es " + persona.getNombre());
        System.out.println("Tengo " + persona.getEdad() + "años");
        System.out.println("Mi telefono es " + persona.getTelefono());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}