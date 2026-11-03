package PruebaGit;

public class numerosAlreves {

        public static void main(String[] args) {

            int[] numeros = new int[5];

            for (int i=0; i<5; i++){
                 numeros[i] = Input.leerEntero((i+1)+ ". Escribe un numero:");
            }
            System.out.println("Los numeros escritos en inversa son: ");
            for (int i=4; i>=0; i--){
                System.out.println(numeros[i]);
            }
        }
}
