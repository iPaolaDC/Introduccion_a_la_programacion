public class Main {
    public static void main(String[] args) {
        // usando IF:
        usandoIf(6);
        // usando WHILE:
        crear_bucle_While(1);
        // usando WHILE:
        crear_Do_While(2);
        //usando FOR:
        crear_For();
        // usando Switch:
        crear_Switch("primavera");
    }

    public static void usandoIf (int numeroIf){
        if (numeroIf > 0 ){
            System.out.println("Es un numero positivo");
        }else{
            System.out.println("Es un numero negativo");
        }
    }

    public static void crear_bucle_While(int numeroWhile){
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
    }

    public static void  crear_Do_While (int numeroDoWhile){
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile +1;
        }while (numeroDoWhile <3);
    }

    public static void crear_For (){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    public static void crear_Switch(String estacion){
        switch (estacion) {
            case "verano" -> System.out.println("Estamos en verano");
            case "invierno" -> System.out.println("Estamos en invierno");
            case "otoño" -> System.out.println("Estamos en otoño");
            case "primavera" -> System.out.println("Estamos en primavera");
            default -> System.out.println("Eso no es una estacion");
        }

    }
}