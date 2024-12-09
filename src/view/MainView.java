package view;

import controller.Ejercicios;
import util.Utilidades;

public class MainView {
    
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();

        // Aqui estara la seleccion del ejercicio que se quiere y tambien aqui mismo se puede agregar muchas mas
        System.out.println("Seleccione Cual Ejercicio quiere del (1-4):");
        int opcion = Utilidades.leerEntero("Ingrese un numero:");

        switch (opcion) {
            case 1: {
                int autosVendidos = Utilidades.leerEntero("Ingrese la cantidad de carros vendidos:");
                double valorTotal = Utilidades.leerDecimal("Ingrese el valor total de los carros vendidos:");
                double pago = ejercicios.calcularPagoEmpleado(autosVendidos, valorTotal);
                System.out.println("El sueldo total del empleado es: $" + pago);
                break;
            }
            case 2: {
                int zona = Utilidades.leerEntero("Ingrese el numero de zona (1-8):");
                int minutos = Utilidades.leerEntero("Ingrese los minutos hablados:");
                double costo = ejercicios.calcularCostoLlamada(zona, minutos);
                System.out.println("El costo total de la llamada es: $" + costo);
                break;
            }
            case 3: {
                int consumo = Utilidades.leerEntero("Ingrese el consumo en m³:");
                boolean terceraEdad = Utilidades.leerBoolean("¿Es de la tercera edad?");
                boolean discapacitado = Utilidades.leerBoolean("¿Es discapacitado?");
                double pago = ejercicios.calcularPagoAgua(consumo, terceraEdad, discapacitado);
                System.out.println("El costo total del servicio de agua potable es: $" + pago);
                break;
            }
            case 4: {
                int n = Utilidades.leerEntero("Ingrese el número de términos para la serie:");
                double resultado = ejercicios.calcularSerie(n);
                System.out.println("El resultado de la serie es: " + resultado);
                break;
            }
            default: {
                System.out.println("Opción no válida.");
                break;
            }
        }
    }
}
