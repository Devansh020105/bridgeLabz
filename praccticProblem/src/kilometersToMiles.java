import java.util.*;
public class kilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in Kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " Kilometers = " + miles + " Miles");
    }
}
