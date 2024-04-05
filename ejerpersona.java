/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerpoo;

/**
 *
 * @author LabSispc06
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ejerpersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese su año de nacimiento:");
        int año = scanner.nextInt();
        System.out.println("Por favor, ingrese su mes de nacimiento (en formato numérico):");
        int mes = scanner.nextInt();
        System.out.println("Por favor, ingrese su día de nacimiento:");
        int dia = scanner.nextInt();
        
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int días = periodo.getDays();
        
        System.out.println("Tienes " + años + " años, " + meses + " meses y " + días + " días.");
        
        scanner.close();
    }
}

