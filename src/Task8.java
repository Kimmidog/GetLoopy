import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int rollNumber = 0;
        boolean continueRolling = true;

        System.out.printf("%-6s%-6s%-6s%-6s%-4s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

        while (continueRolling) {
            rollNumber++;
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int die3 = rand.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%-6d%-6d%-6d%-6d%-4d\n", rollNumber, die1, die2, die3, sum);

            if (die1 == die2 && die2 == die3) {
                System.out.println("You got a triple!");
                System.out.println("Do you want to roll again? (yes/no)");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    continueRolling = false;
                }
            }
        }
        scanner.close();
    }
}
