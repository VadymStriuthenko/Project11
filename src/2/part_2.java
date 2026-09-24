import java.util.Scanner;
public class part_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String answer;
            do {
                System.out.print("Enter any string: ");
                String text = scanner.nextLine();
                System.out.println("Uppercase: " + text.toUpperCase());
                System.out.print("Do you want to continue? (Y/N): ");
                answer = scanner.nextLine();
            } while (answer.equalsIgnoreCase("Y"));
            System.out.println("Program finished.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}