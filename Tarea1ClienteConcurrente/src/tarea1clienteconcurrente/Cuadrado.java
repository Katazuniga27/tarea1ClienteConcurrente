/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1clienteconcurrente;

/**
 *
 * @author milkyaakath
 */
public class Cuadrado extends Forma {
    
    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    // Getter y Setter
    public double obtenerLado() {
        return lado;
    }
    
    public void establecerLado(double lado) {
        this.lado = lado;
    }
}
