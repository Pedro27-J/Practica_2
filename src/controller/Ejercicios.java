package controller;

public class Ejercicios {
    
    public double calcularPagoEmpleado(int autosVendidos, double valorTotalAutos) {
        double sueldoBase = 2500.0;
        double comision = 250.0 * autosVendidos;
        double bonoPorVentasAltas = (valorTotalAutos > 100000) ? 0.05 * valorTotalAutos : 0.0;
        return sueldoBase + comision + bonoPorVentasAltas;
    }

    // Ejercicio 2
    public double calcularCostoLlamada(int zona, int minutos) {
        double[] tarifas = {2.75, 1.80, 3.0, 2.15, 4.0, 2.35, 2.65, 6.0};
        return tarifas[zona - 1] * minutos;
    }

    // Ejercicio 3
    public double calcularPagoAgua(int consumo, boolean terceraEdad, boolean discapacitado) {
        double valorBase = 0;
        if (consumo <= 15) {
            valorBase = 3.0;
        } else if (consumo <= 25) {
            valorBase = 3.0 + (consumo - 15) * 0.10;
        } else if (consumo <= 40) {
            valorBase = 4.0 + (consumo - 25) * 0.15;
        } else {
            valorBase = 6.25 + (consumo - 40) * 0.20;
        }
        double alcantarillado = valorBase * 0.35;
        double total = valorBase + alcantarillado + 0.75 + 0.50;
        if (terceraEdad || discapacitado) {
            total *= 0.65; // 35% de descuento
        }
        return total;
    }

    // Ejercicio 4
    public double calcularSerie(int n) {
        double suma = 0;
        for (int i = 1, numerador = 1, denominador = 1; i <= n; i++) {
            suma += Math.pow((double) numerador / denominador, 2 * i);
            numerador += i;
            denominador += 2;
        }
        return suma;
    }
}
