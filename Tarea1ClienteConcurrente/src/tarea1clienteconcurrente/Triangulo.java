/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1clienteconcurrente;

/**
 *
 * @author milkyaakath
 */
public class Triangulo extends Forma {
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    // Constructor para triángulo con base y altura (para área)
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Getters y Setters
    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerBase(double base) {
        this.base = base;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }
}
