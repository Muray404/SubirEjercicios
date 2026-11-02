package LDPU1;

import java.util.Scanner;

public class EjercicioParcial3 {


//    Un estudiante puede ingresar si tiene una edad igual o superior a 16 años y presenta su carné estudiantil
//    vigente. Sin embargo, los docentes de la universidad tienen acceso sin necesidad de presentar carné.

        public static String ControlBiblioteca() {
            Scanner teclado = new Scanner(System.in);
            System.out.println("----------Controlador de ingreso a Biblioteca----------" + "\n");
            String acceso = "Tiene acceso a la biblioteca";

            System.out.println("¿Que funcion desempeña en la universidad?");
            System.out.println("[Si es docente ingrese (1), Si es estudiante ingrese (2)]" + "\n");
            int funcion = teclado.nextInt();

            int docente = 1;
            int estudiante = 2;

            if (funcion == docente) {
                return acceso;
            }


            System.out.println("\n" + "¿Tiene su carnet estudiantil a la mano?");
            System.out.println("SI (1) , NO (2)" + "\n");
            int carnet = teclado.nextInt();

            System.out.println("\n" + "¿Cual es su edad?");
            int edad = teclado.nextInt();

            if (funcion == estudiante && edad >= 16 && carnet == 1) {
                return acceso;
            } else {
                return acceso = "No " + acceso;
            }

        }


        public static String OfrecedorMesGratis() {
            Scanner teclado = new Scanner(System.in);

//            Un usuario recibe el mes gratis si lleva
//            más de 12 meses suscrito y ha calificado al menos 5 películas. También reciben el mes gratis automáticamente los
//            usuarios que tengan el plan familiar, sin importar su antigüedad ni sus calificaciones.

            System.out.println("----------RECLAMA TU SUSCRIPCION MENSUAL GRATIS----------");
            String suscripcionGratis = ("TIENE ACCESO A UNA SUSCRIPCION MENSUAL GRATIS");

            System.out.println("¿Esta usted suscrito?");
            System.out.println("SI (1), NO (2)");
            int estadoSuscripcion = teclado.nextInt();

            if (estadoSuscripcion != 1) {
                return "NO " + suscripcionGratis;

            }
            System.out.println("¿Tiene una suscripcion familiar? SI (1), NO (2)");
            int suscripcionFamiliar = teclado.nextInt();

            if (suscripcionFamiliar == 1) {
                return suscripcionGratis;

            }else if (suscripcionFamiliar != 2){
                return "NO " + suscripcionGratis;
            }

            System.out.println("¿cuantos meses lleva con su suscripcion?");
            int mesesSuscrito = teclado.nextInt();
            System.out.println("¿Cuantas peliculas ha calificado?");
            int peliculasCalificadas = teclado.nextInt();


            if (mesesSuscrito >= 12 && peliculasCalificadas >= 5) {
                return suscripcionGratis;

            } else {
                return "NO " + suscripcionGratis  + "\n" + "(Acomula 12 meses de suscripcion y ten 5 peliculas calificadas o una suscripcion familiar)";

            }

        }

        public static void main(String[] args) {
//    String mensajepunto1A = ControlBiblioteca();
//        System.out.println("\n" + mensajepunto1A);

            String punto1B = OfrecedorMesGratis();
            System.out.println(punto1B);

        }
    }



