package LDPU2;

import java.util.Scanner;

public class Repositorio {
    public static Scanner input = new Scanner(System.in);

    public static int ingresarEntero (String texto){
        System.out.println(texto);
        return input.nextInt();
    }

    public static double ingresarDouble (String texto){
        System.out.println(texto);
        return input.nextDouble();
    }

    public static boolean ingresarBoolean (String texto){
        System.out.println(texto);
        return input.nextBoolean();
    }

    public static String  ingresarTexto (String texto){
        System.out.println(texto);
        return input.nextLine();
    }

}