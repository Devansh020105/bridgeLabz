import java.util.*;
public class perimeterOfaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hello = "yoyoyo";
        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Width: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
