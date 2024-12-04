/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package malilong_jumayca.rose_circlelab;

/**
 *
 * @author Abram
 */
class Circle {
  
    public double area(double rad) {
        double area = 0.0;
        double getarea = Math.PI * Math.pow(rad, 2);
        area += getarea;
        return area;
    }

    public double circumfer(double radius) {
        double circum = 0;
        double res = 2 * Math.PI * radius;
        circum += res;
        return circum;
    }

    public double diameter(double radius) {
        double diameter = 00.00;
        double getdiameter = 2 * radius;
        diameter += getdiameter;
        return diameter;
    }
}
