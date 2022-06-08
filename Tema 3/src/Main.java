public class Main {
    public static void main(String[] args) {
        // Suma de los numeros ejercicio parte 1
        int resultado;
        resultado = suma(15, 20, 55);
        System.out.println("El resultado es: " + resultado);

        // aumento de puertas ejercicio parte 2
        coche micoche = new coche ();
        micoche.aumentarpuerta();
        micoche.aumentarpuerta();
        System.out.println("aumento de puertas es: " + micoche.puertas);

    }


    public static int suma (int a, int b, int c){
        return a + b + c;
    }
}

class coche{
    // las puertas de mi coche son 4
    public int puertas = 4;

    public void aumentarpuerta(){
        this.puertas++;
    }
}
