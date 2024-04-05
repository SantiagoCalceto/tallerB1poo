/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpoo;

/**
 *
 * @author LabSispc06
 */
import java.util.Scanner;

public class ejercuadrado {
    private double longitud;
    private double ancho;

    public ejercuadrado(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese la longitud del rectángulo:");
        double longitud = scanner.nextDouble();
        System.out.println("Por favor, ingrese el ancho del rectángulo:");
        double ancho = scanner.nextDouble();

        ejercuadrado ejercuadrado = new ejercuadrado(longitud, ancho);

        System.out.println("El área del rectángulo es: " + ejercuadrado.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + ejercuadrado.calcularPerimetro());

        scanner.close();
    }
}

