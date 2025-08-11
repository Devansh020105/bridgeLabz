import java.util.Scanner;
public class level2Practice {
    static Scanner sc = new Scanner(System.in);

    // 1. Print odd and even numbers 1 to n
    public static void printOddEven() {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
        }
    }

    // 2. Employee bonus based on years of service
    public static void employeeBonus() {
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }

    // 3. Multiplication table of a number from 6 to 9
    public static void multiplicationTable6to9() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // 4. FizzBuzz using for loop
    public static void fizzBuzzFor() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    // 5. FizzBuzz using while loop
    public static void fizzBuzzWhile() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int i = 1;
        while (i <= n) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
    }

    // 6. Youngest and tallest friend among Amar, Akbar, Anthony
    public static void youngestAndTallestFriend() {
        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, Anthony (in cm):");
        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        // Find youngest age
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" :
                (youngestAge == akbarAge) ? "Akbar" : "Anthony";

        // Find tallest height
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" :
                (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("Youngest friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + tallestHeight + " cm)");
    }

    // 7. Factors of a number using for loop
    public static void factorsFor() {
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.println(i);
        }
    }

    // 8. Factors of a number using while loop
    public static void factorsWhile() {
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int i = 1;
        System.out.println("Factors of " + number + " are:");
        while (i <= number) {
            if (number % i == 0) System.out.println(i);
            i++;
        }
    }

    // 9. Greatest factor of a number (besides itself) using for loop
    public static void greatestFactorFor() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("No factors other than itself");
            return;
        }
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
    }

    // 10. Greatest factor of a number (besides itself) using while loop
    public static void greatestFactorWhile() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number <= 1) {
            System.out.println("No factors other than itself");
            return;
        }
        int greatestFactor = 1;
        int i = number - 1;
        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
    }

    // 11. All multiples of a number below 100 using for loop
    public static void multiplesBelow100For() {
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) System.out.println(i);
        }
    }

    // 12. Power of a number using for loop
    public static void powerFor() {
        System.out.print("Enter base (positive integer): ");
        int number = sc.nextInt();
        System.out.print("Enter power (non-negative integer): ");
        int power = sc.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("Invalid input");
            return;
        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power " + power + " is " + result);
    }

    // 13. All multiples of a number below 100 using while loop
    public static void multiplesBelow100While() {
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Multiples of " + number + " below 100 are:");
        int i = 100;
        while (i >= 1) {
            if (i % number == 0) System.out.println(i);
            i--;
        }
    }

    // 14. Power of a number using while loop
    public static void powerWhile() {
        System.out.print("Enter base (positive integer): ");
        int number = sc.nextInt();
        System.out.print("Enter power (non-negative integer): ");
        int power = sc.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("Invalid input");
            return;
        }
        int result = 1;
        int count = 0;
        while (count < power) {
            result *= number;
            count++;
        }
        System.out.println(number + " raised to the power " + power + " is " + result);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Call each method one by one for testing
        printOddEven();
        employeeBonus();
        multiplicationTable6to9();
        fizzBuzzFor();
        fizzBuzzWhile();
        youngestAndTallestFriend();
        factorsFor();
        factorsWhile();
        greatestFactorFor();
        greatestFactorWhile();
        multiplesBelow100For();
        powerFor();
        multiplesBelow100While();
        powerWhile();
    }
}
