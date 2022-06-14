public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Paola";
        cliente.edad = 34;
        cliente.telefono = 525632145;
        cliente.credito = 1000;
        System.out.println("Los datos del cliente son:");
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Telefono del cliente: " + cliente.telefono);
        System.out.println("Monto aprobado del credito: $" + cliente.credito);
        trabajador.nombre = "Paola";
        trabajador.edad = 34;
        trabajador.telefono = 525632145;
        trabajador.salario = 50000;
        System.out.println("- - - - - - - - - - - - - - - ");
        System.out.println("Los datos del trabajador son:");
        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad del trabajador: " + trabajador.edad);
        System.out.println("Telefono del trabajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador: $" + trabajador.salario);

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}

