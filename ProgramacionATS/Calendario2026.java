package ProgramacionATS;

import java.util.Scanner;

public class Calendario2026 {
    void main(String[] args) {

        int mes, dia, year;

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe el mes: ");
        mes = input.nextInt();

        if (mes >= 1 && mes <= 12) {
            if (mes == 1) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    }
                }
            } else if (mes == 2) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 28) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");

                    }
                } else {
                    System.out.println("La fecha es invalida: el dia debe estar en el rango de 1 a 28");
                }

            } else if (mes == 3) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 4) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 5) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 6) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 7) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 8) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 9) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 10) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 11) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            } else if (mes == 12) {
                System.out.println("Escribe el dia: ");
                dia = input.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println("Escribe el año: ");
                    year = input.nextInt();
                    if (year > 0) {
                        System.out.println("La fecha es correcta: " + mes + "/" + dia + "/" + year);
                    } else {
                        System.out.println("La fecha es invalida: el año debe estar en el rango de 1 en adelante");
                    }
                }
            }
        }
        else {
            System.out.println("Fecha invalida - mes incorrecto - debe estar en el rango de 1 y 12");
        }
    }
}