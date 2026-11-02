/*
Pensamiento computacional


Abstracción: (problema)
* ¿Que se solicita finalmente? (problema)
R/ calcular el valor final que debe pagar el cliente, teniendo en cuenta el descuento
correspondiente cuando aplique.


* ¿Que informacion es relevante dado el problema anterior?
R/ Cantidad de hojas y valor por hojas , descuento del 15% a estudiante


Descomposición:
* ¿Que acciones se requieren?
R/ solicitar la cantidad de hojas a imprimir, Funcion para calcular el precio final.


* Reutilización de funciones:
R/ No reutilizamos


*Diseño de algoritmos (CODIGO):
*/




package Parcial1;


import java.util.Scanner;


public class Punto2B {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        int precioAlto = 300;
        int precioBajo = 250;




        int cantidadHojas = leerEntero(input, "¿Cuantas hojas vas a imprimir?: ");
        boolean esEstudiante = leerBoolean(input, "¿Eres estudiante? (TRUE/FALSE): ");
        int valor = identificarPrecioUnitarioInicial(cantidadHojas, 250, 300);
        float descuento = cliente(esEstudiante);
        float precioFinal = calcularPrecioFinal(cantidadHojas, valor, descuento);




        if (esEstudiante) {
            System.out.println("-----------IMPRESIONES UNIQUINDIO-----------\n" + "Total de hojas: " + cantidadHojas + "\n cada uno por un valor de: "
                    + valor + "COP" + "\n POR SE ESTUDIANTE SE OTORGA UN DESCUENTO DEL 15% \n Precio final: " + precioFinal);
        } else {
            System.out.println("-----------IMPRESIONES UNIQUINDIO-----------\n" + "Total de hojas: " + cantidadHojas + " \n cada uno por un valor de: "
                    + valor + " COP" + " \n Precio final: " + precioFinal + " COP");
        }




    }


    //----------------------------------------------------------------------------------------------------
    public static boolean leerBoolean(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextBoolean();
    }




    //----------------------------------------------------------------------------------------------------
    public static float cliente(boolean esEstudiante) {




        if (esEstudiante) {
            return 0.85f;
        } else {
            return 1;
        }
    }




    //----------------------------------------------------------------------------------------------------
    public static int leerEntero(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextInt();
    }


    //----------------------------------------------------------------------------------------------------
    public static int identificarPrecioUnitarioInicial(int cantidadHojas, int precioHojaBajo, int precioHojaAlto) {




        if (cantidadHojas <= 50) {
            return precioHojaAlto;
        } else {
            return precioHojaBajo;
        }
    }




//----------------------------------------------------------------------------------------------------




    public static float calcularPrecioFinal(int cantidad, int valor, float descuento) {
        return (cantidad * valor) * descuento;
    }
}
