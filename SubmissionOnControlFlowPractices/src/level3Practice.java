import java.util.Scanner;
public class level3Practice {
    static Scanner sc = new Scanner(System.in);

    // 1a. Leap year - multiple if else
    public static void leapYearMultiIfElse() {
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582");
            return;
        }
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is NOT a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }

    // 1b. Leap year - single if with logical operators
    public static void leapYearSingleIf() {
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }

    // 2. Marks & grade calculator
    public static void marksAndGrade() {
        System.out.print("Enter marks in Physics, Chemistry, and Maths: ");
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();
        double total = physics + chemistry + maths;
        double percentage = total / 3.0;

        String grade, remarks;
        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "D";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "E";
            remarks = "Below Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.printf("Average marks: %.2f%%\nGrade: %s\nRemarks: %s\n", percentage, grade, remarks);
    }

    // 3. Prime number check
    public static void isPrimeNumber() {
        System.out.print("Enter an integer (>1): ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Number must be greater than 1");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) { // optimization: sqrt(num)
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is a Prime Number" : " is NOT a Prime Number"));
    }

    // 4. Armstrong number check
    public static void isArmstrongNumber() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }

        System.out.println(number + (sum == number ? " is an Armstrong Number" : " is NOT an Armstrong Number"));
    }

    // 5. Count digits in an integer
    public static void countDigits() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int count = 0;
        int temp = Math.abs(number);  // handle negative numbers

        if (temp == 0) count = 1; // zero has one digit
        else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + number + " is " + count);
    }

    // 6. BMI calculator
    public static void calculateBMI() {
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        System.out.printf("BMI is: %.2f\n", bmi);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal weight";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        System.out.println("Weight status: " + status);
    }

    // 7. Harshad number check
    public static void isHarshadNumber() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        int temp = Math.abs(number);

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is NOT a Harshad Number");
        }
    }

    // 8. Abundant number check
    public static void isAbundantNumber() {
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }
    }

    // 9. Calculator using switch...case
    public static void calculator() {
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.println("Result: " + (first + second));
            case "-" -> System.out.println("Result: " + (first - second));
            case "*" -> System.out.println("Result: " + (first * second));
            case "/" -> {
                if (second == 0) System.out.println("Division by zero error!");
                else System.out.println("Result: " + (first / second));
            }
            default -> System.out.println("Invalid Operator");
        }
    }

    // 10. DayOfWeek using Zeller's formula
    public static void dayOfWeek() {
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;

        int f = d + 13*(m+1)/5 + K + K/4 + J/4 + 5*J;
        int dayOfWeek = f % 7;

        // Zeller's congruence returns 0=Saturday,1=Sunday,... So adjusting:
        int adjustedDay = (dayOfWeek + 6) % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of the week is: " + adjustedDay + " (" + days[adjustedDay] + ")");
    }

    public static void main(String[] args) {
        System.out.println("--- Leap Year Multi If-Else ---");
        leapYearMultiIfElse();
        System.out.println("\n--- Leap Year Single If ---");
        leapYearSingleIf();
        System.out.println("\n--- Marks and Grade ---");
        marksAndGrade();
        System.out.println("\n--- Prime Number Check ---");
        isPrimeNumber();
        System.out.println("\n--- Armstrong Number Check ---");
        isArmstrongNumber();
        System.out.println("\n--- Count Digits ---");
        countDigits();
        System.out.println("\n--- BMI Calculator ---");
        calculateBMI();
        System.out.println("\n--- Harshad Number Check ---");
        isHarshadNumber();
        System.out.println("\n--- Abundant Number Check ---");
        isAbundantNumber();
        System.out.println("\n--- Calculator ---");
        calculator();
        System.out.println("\n--- Day of Week ---");
        dayOfWeek();
    }
}
