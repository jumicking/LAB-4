
package malilong_jumayca.rose_circlelab;

import javax.swing.JOptionPane;

public class Malilong_JumaycaRose_CircleLab {

    
    public static void main(String[] args) {
      
        boolean loop = true;

        while (loop == true) {
            Circle cir = new Circle();

            String response;
            String response2;
            double radius = 0.0;
            double angle = 0;
            int convert = 0;
            int convert2 = 0;

            // TODO code application logic here
            int opt = JOptionPane.showConfirmDialog(null, "Welcome to circle calculator", "Click YES to continue", JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                String code = JOptionPane.showInputDialog("Select a specific method"
                        + "\n Calculation                           \t code"
                        + "\n Area of Circle                          \t 1 "
                        + "\n Circumference of Circle       \t 2 "
                        + "\n Diameter of Circle                  \t 3 ");
                switch (code) {
                    case "1":
                        response = JOptionPane.showInputDialog("Radius:");
                        convert = Integer.parseInt(response);
                        JOptionPane.showMessageDialog(null, "Area of Circle=" + cir.area(convert));
                        break;
                    case "2":
                        response = JOptionPane.showInputDialog("Radius:");
                        convert = Integer.parseInt(response);
                        JOptionPane.showMessageDialog(null, "Circumference of Circle = " + cir.circumfer(convert));
                        break;
                    case "3":
                        response = JOptionPane.showInputDialog("Radius:");
                        convert = Integer.parseInt(response);
                        JOptionPane.showMessageDialog(null, "Diameter of Cirle = " + cir.diameter(convert));
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, " ERROR!!!!!!!!!! ");
                }

            }
                int response3 = JOptionPane.showConfirmDialog(null, "Do you want to perform another calculation?", "Continue?", JOptionPane.YES_NO_OPTION);

                if (response3 == JOptionPane.NO_OPTION) {
                    loop = false;
                }
            }

        }

    }

    
