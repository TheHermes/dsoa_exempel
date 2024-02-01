import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc1 = new Calculator();
        Random random = new Random();


        //FileUtils.writeTextFile("Morjens", "hello.txt");

        String fileCont = FileUtils.readTextFile("hello.txt");


        System.out.println(fileCont);


        Customer cust = new Customer(1000);

        //System.out.printf("Skriv: ");

        //String userName = scanner.nextLine();
        //System.out.printf("Your name %s\n", userName);


        //int myInt = Utils.getIntInput("Give me number!: ");

        //System.out.printf("Your input: %s", myInt);
        /*while(true) {
            System.out.printf("Random number: %d \n(Press ENTER for another random number, Q to exit the program!)",
                    random.nextInt(0, 100)
            );
            String input = scanner.nextLine();
            if (input.equals("q")){
                System.out.println("Goodbye...");
                System.exit(1);
                break;
            }
        };






        /*while(true){
            try {
                System.out.printf("Skriv in ett tal: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.printf("\nSkriv in ett till tal: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                System.out.printf("%d * %d = %.0f", num1, num2, calc1.multiply(num1, num2));
                break;
            } catch(NumberFormatException e) {
                System.out.println("Du måste skriva in ett heltal!");
            }
        }*/




        //System.out.println(random.nextInt(99));
        //System.out.println(random.nextInt(99, 999));

        /*Car car = new Car("Brita");
        System.out.println(car.getName() + " " + car.getType());
        car.setName("Trina");
        System.out.println(car.getName() + " " + car.getType());
        Bike bike = new Bike("Bruno");
        System.out.println(bike.getName() + " " + bike.getType());

        Shirt diorShirt = new Shirt("Dior", 39.95f, "Brown");
        Shirt plainShirt = new Shirt("Balenciaga", 50.00f, "White");
        plainShirt.setPrice(19.95f);
        diorShirt.setColour("Blue");
        System.out.println(diorShirt.getBrand() + " " + diorShirt.getColour() + " (" + diorShirt.getPrice() + "€)");
        System.out.println(plainShirt.getBrand() + " " + plainShirt.getColour() + " (" + plainShirt.getPrice() + "€)");
        car.soundWarning();*/

        // Code Challenge Lektion 3
        /*Calculator calc = new Calculator();
        System.out.printf("2 tals multiplikation: %.2f\n", calc.multiply(1, 2));
        System.out.printf("3 tals multiplikation: %.2f\n", calc.multiply(1, 2, 3));
        System.out.printf("4 tals multiplikation: %.2f", calc.multiply(1, 2, 3, 4));*/



    }
}