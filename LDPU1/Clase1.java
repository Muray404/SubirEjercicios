package LDPU1;
import java.util.Scanner;
public class Clase1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int cantidadCafes = ingresarEntero(input, "Ingresa la cantidad de cafés: ");
        float precioUnitario = ingresarReal(input, "Ingresa el precio unitario: ");
        float total = calcularTotal(cantidadCafes, precioUnitario);
        String factura = generarMensaje(cantidadCafes, precioUnitario, total);
        mostrarMensaje(factura);
    }

    public static int ingresarEntero (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextInt();
    }

    public static float ingresarReal (Scanner input, String pregunta){
        System.out.println(pregunta);
        return input.nextFloat();
    }

    public static float calcularTotal (int cantidadCafes, float precioUnitario){
        return cantidadCafes * precioUnitario;
    }

    public static String generarMensaje (int cantidadCafes, float precioUnitario, float total){
        return "Compraste"+ cantidadCafes + "- cada uno con valor de: " + precioUnitario + "Total a pagar: $" + total;
    }
    public static String mostrarMensaje (String factura) {
        System.out.println(factura);
    return factura;
    }
    }
