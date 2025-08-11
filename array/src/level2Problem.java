import java.util.*;
public class level2Problem {
    static Scanner sc = new Scanner(System.in);

    // 1. Bonus calculation for 10 employees
    public static void bonusCalculation() {
        int n = 10;
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee %d salary: ", i + 1);
            salary[i] = sc.nextDouble();
            System.out.printf("Employee %d years of service: ", i + 1);
            years[i] = sc.nextDouble();

            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input. Please re-enter values for this employee.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee bonuses and new salaries:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee %d: Old Salary=%.2f, Bonus=%.2f, New Salary=%.2f%n",
                    i + 1, salary[i], bonus[i], newSalary[i]);
        }
        System.out.printf("Total bonus payout: %.2f%n", totalBonus);
        System.out.printf("Total old salary: %.2f%n", totalOldSalary);
        System.out.printf("Total new salary: %.2f%n", totalNewSalary);
    }

    // 2. Youngest and tallest friend among Amar, Akbar, Anthony
    public static void youngestAndTallestFriends() {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int n = names.length;
        int[] ages = new int[n];
        double[] heights = new double[n];

        System.out.println("Enter ages and heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%s's age: ", names[i]);
            ages[i] = sc.nextInt();
            System.out.printf("%s's height (in cm): ", names[i]);
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < n; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex] + " with height " + tallestHeight + " cm");
    }

    // 3. Store digits of number, find largest and second largest element (with array resize)
    public static void largestTwoDigits() {
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                // Increase size by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        if (index == 0) {
            System.out.println("No digits found.");
            return;
        }

        // Find largest and second largest
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Digits array: " + Arrays.toString(Arrays.copyOf(digits, index)));
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "None" : secondLargest));
    }

    // 4. Reverse a number using digits array
    public static void reverseNumber() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 0) count = 1;  // For number 0

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.print("Digits in reverse order: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    // 5. BMI calculation and display height, weight, BMI, status for multiple persons
    public static void bmiCalculation() {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.printf("Enter weight (kg) for person %d: ", i + 1);
                weight[i] = sc.nextDouble();
            } while (weight[i] <= 0);

            do {
                System.out.printf("Enter height (cm) for person %d: ", i + 1);
                height[i] = sc.nextDouble();
            } while (height[i] <= 0);
        }

        for (int i = 0; i < n; i++) {
            double heightMeters = height[i] / 100.0;
            bmi[i] = weight[i] / (heightMeters * heightMeters);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal weight";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("Person | Height (cm) | Weight (kg) | BMI    | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%6d | %11.2f | %11.2f | %6.2f | %s%n",
                    i + 1, height[i], weight[i], bmi[i], status[i]);
        }
    }

    // 6. BMI calculation using 2D array
    public static void bmiCalculation2D() {
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];  // weight, height, bmi
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.printf("Enter weight (kg) for person %d: ", i + 1);
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.printf("Enter height (cm) for person %d: ", i + 1);
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            double heightMeters = personData[i][1] / 100.0;
            personData[i][2] = personData[i][0] / (heightMeters * heightMeters);

            double bmiVal = personData[i][2];
            if (bmiVal < 18.5) weightStatus[i] = "Underweight";
            else if (bmiVal < 25) weightStatus[i] = "Normal weight";
            else if (bmiVal < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("Person | Weight(kg) | Height(cm) | BMI    | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %6.2f | %s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }

    // 7. Marks input for students, compute percentage and grade
    public static void gradesAndPercentages() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d physics marks: ", i + 1);
            physics[i] = sc.nextInt();
            if (physics[i] < 0) {
                System.out.println("Invalid input. Enter positive value.");
                i--;
                continue;
            }
            System.out.printf("Student %d chemistry marks: ", i + 1);
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Invalid input. Enter positive value.");
                i--;
                continue;
            }
            System.out.printf("Student %d maths marks: ", i + 1);
            maths[i] = sc.nextInt();
            if (maths[i] < 0) {
                System.out.println("Invalid input. Enter positive value.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            double p = percentages[i];

            if (p >= 90) grades[i] = "A";
            else if (p >= 80) grades[i] = "B";
            else if (p >= 70) grades[i] = "C";
            else if (p >= 60) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d | %7d | %9d | %5d | %10.2f | %s%n",
                    i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
    }

    // 8. Grades and percentages with 2D array
    public static void gradesPercentages2D() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];  // physics, chemistry, maths
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d physics marks: ", i + 1);
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Invalid input. Enter positive value.");
                i--;
                continue;
            }
            System.out.printf("Student %d chemistry marks: ", i + 1);
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Invalid input. Enter positive value.");
                i--;
                continue;
            }
            System.out.printf("Student %d maths marks: ", i + 1);
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Invalid input. Enter positive value.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            double p = percentages[i];
            if (p >= 90) grades[i] = "A";
            else if (p >= 80) grades[i] = "B";
            else if (p >= 70) grades[i] = "C";
            else if (p >= 60) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d | %7d | %9d | %5d | %10.2f | %s%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }

    // 9. Frequency of each digit in number
    public static void digitFrequency() {
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) break;
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        int[] freq = new int[10];
        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + freq[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Bonus calculation:");
        bonusCalculation();

        System.out.println("\n2. Youngest and tallest friends:");
        youngestAndTallestFriends();

        System.out.println("\n3. Largest and second largest digit:");
        largestTwoDigits();

        System.out.println("\n4. Reverse a number:");
        reverseNumber();

        System.out.println("\n5. BMI calculation:");
        bmiCalculation();

        System.out.println("\n6. BMI calculation with 2D array:");
        bmiCalculation2D();

        System.out.println("\n7. Marks and grades:");
        gradesAndPercentages();

        System.out.println("\n8. Marks and grades with 2D array:");
        gradesPercentages2D();

        System.out.println("\n9. Digit frequency:");
        digitFrequency();
    }
}
