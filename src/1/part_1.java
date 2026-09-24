import java.util.Scanner;
import static java.lang.IO.print;
import static java.lang.IO.println;
public class part_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Demonstrate while loop
        int age = 18;
        while (age < 24) {
            println("Age: " + age);
            age++;
        }
        // 2. Demonstrate do while loop
        int number = 1;
        do {
            println("Number: " + number);
            number++;
        } while (number <= 5);
        // 3. Demonstrate for loop

        // 3.1 Increment: 1 2 3 4 5 6 7 8 9 10
        for (int i = 1; i <= 10; i++) {
            print(i + " ");
        }
        println();
        // 3.2 Decrement: 10 9 8 7 6 5 4 3 2 1
        for (int i = 10; i >= 1; i--) {
            print(i + " ");
        }
        println();
        // 4. Iterate through String
        String word = "Programming";
        for (int i = 0; i < word.length(); i++) {
            println(word.charAt(i));
        }

        // 5. Nested loop
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                print("* ");
            }
            println();
        }
    }
}