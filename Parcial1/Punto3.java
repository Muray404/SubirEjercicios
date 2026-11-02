package Parcial1;


import java.util.Scanner;


public class Punto3 {




    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);




        double nota1 = ingresarDouble(input, "¿Cual es la primer nota obtenida?: ");
        double nota2 = ingresarDouble(input, "¿Cual es la segunda nota obtenida?: ");
        double nota3 = ingresarDouble(input, "¿Cual es la tercer nota obtenida?: ");
        double promedio = calcularPromedio(nota1, nota2, nota3);
        String mensaje = mensaje();
        String clasificacion = clasificacion(promedio);








        System.out.println("Tu promedio es: " + promedio);




        String clasifica = clasificacion(promedio);




        System.out.println( "Su promedio ha sido " + clasifica);
    }
//------------------------------------------------------------------------------------------------------------




    public static double ingresarDouble(Scanner input, String pregunta) {
        System.out.println(pregunta);
        return input.nextDouble();
    }
//------------------------------------------------------------------------------------------------------------




    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }


    //------------------------------------------------------------------------------------------------------------
    public static String clasificacion(double promedio) {
        if (promedio < 3)
            return "reprobado";




        else if (promedio >= 3 && promedio <= 3.9) {
            return "aprobado";
        } else {
            return "excelente";
        }
    }
    //------------------------------------------------------------------------------------------------------------


    public static String mensaje() {
        return "\n  Su promedio ha sido: ";


    }


}
