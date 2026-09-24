import java.util.Scanner;
public class part_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Hi! What is your name? ");
            String name = scanner.nextLine();
            System.out.print("How old are you? ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nice to meet you, " + name + "!");
            if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are under 18.");
            }
            System.out.print("Do you want to continue? (Y/N): ");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("Y"));
        System.out.println("Program finished.");
    }
}