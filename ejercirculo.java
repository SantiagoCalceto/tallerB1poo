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
public class ejercirculo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del rectángulo:");
        double longitud = scanner.nextDouble();

        System.out.println("Ingrese la anchura del rectángulo:");
        double anchura = scanner.nextDouble();

   
        double area = calcularArea(longitud, anchura);

      
        double perimetro = calcularPerimetro(longitud, anchura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        scanner.close();
    }

  
    public static double calcularArea(double longitud, double anchura) {
        return longitud * anchura;
    }

 
    public static double calcularPerimetro(double longitud, double anchura) {
        return 2 * (longitud + anchura);
    }
}


