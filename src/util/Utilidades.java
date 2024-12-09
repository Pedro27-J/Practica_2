package util;

import java.util.Scanner;

public class Utilidades {
    
    public static int leerEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static double leerDecimal(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public static boolean leerBoolean(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje + " (true/false):");
        return scanner.nextBoolean();
    }
}
