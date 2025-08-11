import java.util.Scanner;
public class SubmissionOnControlFlowPractices {

    static Scanner sc = new Scanner(System.in);

    // 1. Check if number is divisible by 5
    public static void checkDivisibleBy5() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
    }

    // 2. Check if first is smallest of 3 numbers
    public static void checkFirstSmallest() {
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));
    }

    // 3. Check which is largest
    public static void checkLargestOfThree() {
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        System.out.println("Is the first number the largest? " + (n1 > n2 && n1 > n3));
        System.out.println("Is the second number the largest? " + (n2 > n1 && n2 > n3));
        System.out.println("Is the third number the largest? " + (n3 > n1 && n3 > n2));
    }

    // 4. Check natural number & sum formula
    public static void sumNaturalNumbersFormula() {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting eligibility
    public static void checkVotingEligibility() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }

    // 6. Positive, negative, zero
    public static void checkNumberType() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // 7. Spring Season check
    public static void springSeasonCheck() {
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }

    // 8. Countdown using while loop
    public static void countdownWhile() {
        System.out.print("Enter starting number for countdown: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }

    // 9. Countdown using for loop
    public static void countdownFor() {
        System.out.print("Enter starting number for countdown: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // 10. Sum until user enters 0
    public static void sumUntilZero() {
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double num = sc.nextDouble();
            if (num == 0) break;
            total += num;
        }
        System.out.println("Total sum: " + total);
    }

    // 11. Sum until 0 or negative
    public static void sumUntilZeroOrNegative() {
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            if (num <= 0) break;
            total += num;
        }
        System.out.println("Total sum: " + total);
    }

    // 12. Sum n natural numbers (while loop + formula)
    public static void sumNaturalNumbersWhile() {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0, i = 1;
            while (i <= n) sumLoop += i++;
            System.out.println("Formula sum: " + sumFormula + ", Loop sum: " + sumLoop);
            System.out.println("Match? " + (sumFormula == sumLoop));
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 13. Sum n natural numbers (for loop + formula)
    public static void sumNaturalNumbersFor() {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) sumLoop += i;
            System.out.println("Formula sum: " + sumFormula + ", Loop sum: " + sumLoop);
            System.out.println("Match? " + (sumFormula == sumLoop));
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 14. Factorial using while loop
    public static void factorialWhile() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= n) fact *= i++;
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }

    // 15. Factorial using for loop
    public static void factorialFor() {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n >= 0) {
            long fact = 1;
            for (int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Invalid input");
        }
    }

    // 16. Odd and even numbers
    public static void printOddEven() {
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
            }
        } else {
            System.out.println("Not a natural number");
        }
    }

    // 17. Employee bonus
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

    // 18. Multiplication table from 6 to 9
    public static void multiplicationTable6to9() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }


    public static void main(String[] args) {
            // You can call any function here to test
            checkDivisibleBy5();
            checkFirstSmallest();
            checkLargestOfThree();
            sumNaturalNumbersFormula();
            checkVotingEligibility();
            checkNumberType();
            springSeasonCheck();
            countdownWhile();
            countdownFor();
            sumUntilZero();
            sumUntilZeroOrNegative();
            sumNaturalNumbersWhile();
            sumNaturalNumbersFor();
            factorialWhile();
            factorialFor();
            printOddEven();
            employeeBonus();
            multiplicationTable6to9();
    }
}