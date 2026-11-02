package LDPU1;

import java.util.Scanner;

    public class EjercicioParcial1 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cantidadCafes = ingresarEntero(input, "¿Cuantos cafes vas a comprar?: ");
        double precioUnitario = ingresarDouble(input, "¿Cual es el valor de cada café?: ");
        double total = calcularTotal(cantidadCafes, precioUnitario);
        String mensaje = generarMensaje(cantidadCafes, precioUnitario, total);
        mostrarMensaje(mensaje);

    }

    public static int ingresarEntero (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextInt();
    }

    public static double ingresarDouble (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextDouble();
    }

    public static double calcularTotal (int cantidadCafes, double valorUnitario){
        return cantidadCafes * valorUnitario;
    }

    public static String generarMensaje (int cantidadCafes, double valorUnitario, double total){
        return "Compraste " + cantidadCafes + " cada uno por el valor de " + valorUnitario + " da un total de: " + total;
    }

    public static void mostrarMensaje (String mensaje) {
        System.out.println(mensaje);
    }


}