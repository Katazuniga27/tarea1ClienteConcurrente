/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1clienteconcurrente;

/**
 *
 * @author milkyaakath
 */
public class Circulo extends Forma {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Getter y Setter
    public double obtenerRadio() {
        return radio;
    }

    public void establecerRadio(double radio) {
        this.radio = radio;
    }
}
