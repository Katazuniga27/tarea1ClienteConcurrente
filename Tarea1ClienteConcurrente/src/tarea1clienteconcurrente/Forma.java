/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1clienteconcurrente;

/**
 *
 * @author milkyaakath
 */
public abstract class Forma {

    // Métodos abstractos que deben ser implementados por las clases hijas
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Método concreto que pueden usar todas las formas
    public void mostrarInformacion() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("------------------------");
    }
}
