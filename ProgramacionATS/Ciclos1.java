package ProgramacionATS;

import java.util.Scanner;

public class Ciclos1 {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edad,sumaEdad=0, conteoInicial, promedioEdad, conteoMayorEdad=0, conteoMayorAltura=0;
        float estatura,sumaEstatura=0, promedioEstatura;

        for (conteoInicial=1; conteoInicial<=5; conteoInicial++){
            System.out.println("Escribe la edad del alumno: " + conteoInicial + ": ");
            edad = input.nextInt();
            System.out.println("Escribe la estatura del alumno numero " + conteoInicial + ": ");
            estatura = input.nextFloat();
            sumaEdad += edad;
            sumaEstatura += estatura;

            if (edad>=18){
                conteoMayorEdad++;
            }
            else {
                conteoMayorEdad+=0;
            }

            if (estatura>=1.75f){
                conteoMayorAltura++;
            }
            else {
                conteoMayorAltura+=0;
            }


        }


        promedioEdad = sumaEdad / (conteoInicial-1);
        promedioEstatura = sumaEstatura / (conteoInicial-1);
        System.out.println("El promedio de edad es de: " + promedioEdad);
        System.out.println("El promedio de estatura es de: " + promedioEstatura);
        System.out.println("Hay un total de: " + conteoMayorEdad + " estudiantes mayores a 18 años");
        System.out.println("Hay un total de: " + conteoMayorAltura + " estudiantes que miden mas de 1.75");





    }
}
