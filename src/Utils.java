import java.util.Scanner;

public class Utils {
    Scanner userInput = new Scanner(System.in);
    public static int getIntInput(String ipt) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.printf("%s", ipt);
            try {
                return Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Only integers!");
            }

        }
    }
}
