package malilong_jumayca.rose_circlelab;

import java.util.Scanner;

public class Malilong_JumaycaRose_CircleLab {

    public static void main(String[] args) {

        // Prompt the user to input a radius
        try (Scanner scanner = new Scanner(System.in)) {

            // Prompt the user to input a radius
            System.out.println("Please enter the radius of the circle: ");
            double userRadius = scanner.nextDouble();
            System.out.println();

            // Circle object with user-provided input
            Circle circle = new Circle(userRadius);

            // Display the circle's details
            System.out.println("Welcome to Circle Calculator");
            System.out.println("Radius: " + circle.getRadius());
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            System.out.println("Diameter: " + circle.getDiameter());

        }

        System.out.println("Thank you for using the Circle Calculator!");
    }
}
