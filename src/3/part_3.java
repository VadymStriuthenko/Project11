import java.util.Scanner;
public class part_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String answer;
            do {
                System.out.print("Enter any string: ");
                String text = scanner.nextLine();
                System.out.print("Reversed string: ");
                for (int i = text.length() - 1; i >= 0; i--) {
                    System.out.print(text.charAt(i));
                }
                System.out.println();
                System.out.print("Do you want to continue? (Y/N): ");
                answer = scanner.nextLine();
            } while (answer.equalsIgnoreCase("Y"));
            System.out.println("Program finished.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}