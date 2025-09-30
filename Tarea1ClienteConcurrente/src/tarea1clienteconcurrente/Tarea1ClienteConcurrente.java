/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1clienteconcurrente;

/**
 *
 * @author milkyaakath
 */
public class Tarea1ClienteConcurrente {

    public static void main(String[] args) {

        // Arreglo polimórfico de formas (herencia y polimorfismo)
        Forma[] formas = {
            new Circulo(5.0),
            new Triangulo(6.0, 4.0, 3.0, 4.0, 5.0),
            new Cuadrado(4.0),
            new Circulo(3.5),
            new Cuadrado(7.0)
        };

        System.out.println("=== APLICACIÓN DE GEOMETRÍA ===\n");

        // Mostrar información de todas las formas
        System.out.println("Información de todas las formas:");
        for (Forma forma : formas) {
            forma.mostrarInformacion();
        }

        // Encontrar la forma con mayor área
        System.out.println("\n=== ANÁLISIS DE FORMAS ===");
        Forma formaMayorArea = formas[0];
        Forma formaMayorPerimetro = formas[0];

        for (Forma forma : formas) {
            if (forma.calcularArea() > formaMayorArea.calcularArea()) {
                formaMayorArea = forma;
            }
            if (forma.calcularPerimetro() > formaMayorPerimetro.calcularPerimetro()) {
                formaMayorPerimetro = forma;
            }
        }

        System.out.println("Forma con mayor área: " + formaMayorArea.getClass().getSimpleName());
        System.out.println("Área: " + String.format("%.2f", formaMayorArea.calcularArea()));

        System.out.println("Forma con mayor perímetro: " + formaMayorPerimetro.getClass().getSimpleName());
        System.out.println("Perímetro: " + String.format("%.2f", formaMayorPerimetro.calcularPerimetro()));

        // Mostrar formas por tipo
        System.out.println("\n=== FORMAS POR TIPO ===");
        for (Forma forma : formas) {
            if (forma instanceof Circulo) {
                System.out.println("Círculo - Área: " + String.format("%.2f", forma.calcularArea()));
            } else if (forma instanceof Triangulo) {
                System.out.println("Triángulo - Área: " + String.format("%.2f", forma.calcularArea()));
            } else if (forma instanceof Cuadrado) {
                System.out.println("Cuadrado - Área: " + String.format("%.2f", forma.calcularArea()));
            }
        }

        // Calcular áreas y perímetros totales
        System.out.println("\n=== ESTADÍSTICAS TOTALES ===");
        double areaTotal = 0;
        double perimetroTotal = 0;

        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
            perimetroTotal += forma.calcularPerimetro();
        }

        System.out.println("Área total de todas las formas: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetro total de todas las formas: " + String.format("%.2f", perimetroTotal));
    }
}
