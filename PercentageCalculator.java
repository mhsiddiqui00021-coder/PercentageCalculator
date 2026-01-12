import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximumMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / maximumMarks) * 100;

        System.out.println("Percentage Marks: " + percentage + "%");

        scanner.close();
    }
}
