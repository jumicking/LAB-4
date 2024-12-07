
package malilong_jumayca.rose_circlelab;

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
