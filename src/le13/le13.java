package le13;
import java.util.Scanner;

public class le13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age in years: ");
        int age = scanner.nextInt();

        double bmrFemale = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        double bmrMale = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);

        double barsFemale = bmrFemale / 230.0;
        double barsMale = bmrMale / 230.0;

        System.out.printf("Chocolate bars needed to maintain weight:\n");
        System.out.printf("For a Woman: %.2f bars (BMR: %.2f)\n", barsFemale, bmrFemale);
        System.out.printf("For a Man: %.2f bars (BMR: %.2f)\n", barsMale, bmrMale);

        scanner.close();
    }
}

