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

    public static int countdown(int n) {
        System.out.print(n + " ");
        if (n != 1) {
            return countdown(n - 1);
        } else return 0;


    }

    public static long pow(long a, long ex) {

        if (ex != 0) {
            return a * pow(a, ex - 1);
        } else return 1;


    }
}
