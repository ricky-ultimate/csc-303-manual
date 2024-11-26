/*
    Use JOptionPane to calculate the area of a triangle
*/

import javax.swing.JOptionPane;
public class Section_3_2_Ex_4 {
    public static void main(String[] args){
        double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Height: "));

        double area = triangleArea(base, height);
        JOptionPane.showMessageDialog(null, "Area of the triangle: " + area+"cm^2");
    }

    public static double triangleArea(double base, double height){
        return 0.5 * base * height;
    }
}
