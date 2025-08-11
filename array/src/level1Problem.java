import java.util.*;
public class level1Problem {
    static Scanner sc = new Scanner(System.in);

    // 1. Voting eligibility of 10 students
    public static void checkVotingForStudents() {
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0) System.out.println("Invalid age: " + age);
            else if (age >= 18) System.out.println("The student with the age " + age + " can vote.");
            else System.out.println("The student with the age " + age + " cannot vote.");
        }
    }

    // 2. Check positive/negative/zero and even/odd, compare first and last
    public static void checkNumbersAndCompare() {
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int num : nums) {
            if (num > 0) {
                System.out.print(num + " is positive and ");
                System.out.println(num % 2 == 0 ? "even" : "odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        // Compare first and last elements
        if (nums[0] == nums[nums.length - 1])
            System.out.println("First and last elements are equal.");
        else if (nums[0] > nums[nums.length - 1])
            System.out.println("First element is greater than last element.");
        else
            System.out.println("First element is less than last element.");
    }

    // 3. Multiplication table for a number (1 to 10)
    public static void multiplicationTable() {
        System.out.print("Enter a number for multiplication table: ");
        int number = sc.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        System.out.println("Multiplication table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }

    // 4. Store up to 10 values until 0 or negative, then sum
    public static void storeNumbersAndSum() {
        double[] numbers = new double[10];
        int index = 0;
        System.out.println("Enter numbers (0 or negative to stop, max 10):");
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) break;
            numbers[index++] = num;
        }
        double total = 0;
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nSum of numbers: " + total);
    }

    // 5. Multiplication table from 6 to 9, store and display
    public static void multiplicationTable6to9() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }

    // 6. Mean height of football team (11 players)
    public static void meanHeightFootballTeam() {
        double[] heights = new double[11];
        System.out.println("Enter heights of 11 players:");
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.printf("Mean height of the football team: %.2f\n", mean);
    }

    // 7. Save odd and even numbers to arrays between 1 and number
    public static void saveOddEvenNumbers() {
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Error: Not a natural number");
            return;
        }
        int maxSize = number / 2 + 1;
        int[] oddNumbers = new int[maxSize];
        int[] evenNumbers = new int[maxSize];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) System.out.print(oddNumbers[i] + " ");
        System.out.println();

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) System.out.print(evenNumbers[i] + " ");
        System.out.println();
    }

    // 8. Find factors of number, store in array, display
    public static void factorsOfNumber() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }

    // 9. Copy 2D array into 1D array
    public static void copy2DArrayTo1D() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                array[index++] = val;
            }
        }

        System.out.println("1D array after copying:");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // 10. FizzBuzz: Save result to string array and print with positions
    public static void fizzBuzz() {
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Error: Number must be positive.");
            return;
        }
        String[] results = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i == 0) results[i] = "0";
            else if (i % 15 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }

        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Voting eligibility of 10 students:");
        checkVotingForStudents();

        System.out.println("\n2. Positive/Negative/Zero and even/odd check + compare first and last:");
        checkNumbersAndCompare();

        System.out.println("\n3. Multiplication table (1 to 10):");
        multiplicationTable();

        System.out.println("\n4. Store numbers until 0 or negative, then sum:");
        storeNumbersAndSum();

        System.out.println("\n5. Multiplication table from 6 to 9:");
        multiplicationTable6to9();

        System.out.println("\n6. Mean height of football team:");
        meanHeightFootballTeam();

        System.out.println("\n7. Save odd and even numbers:");
        saveOddEvenNumbers();

        System.out.println("\n8. Factors of number stored and displayed:");
        factorsOfNumber();

        System.out.println("\n9. Copy 2D array to 1D array:");
        copy2DArrayTo1D();

        System.out.println("\n10. FizzBuzz program:");
        fizzBuzz();
    }
}
