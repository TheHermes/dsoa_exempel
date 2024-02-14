import java.time.LocalDate;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {

        /*String[] videoGameCharacters = {"Mario", "Luigi", "Link", "Zelda", "Princess Peach", "Bowser", "Yoshi", "Donkey Kong", "Samus Aran", "Kirby", "Fox McCloud", "Pikachu"};

        String character1 = "Sonic";
        String character2 = "Shadow";

        Person person1 = new Person("Shadow");
        Person person2 = new Person("Nelf");
        Person person3 = new Person("Sailer");
        Person current = person2;

        Linky linky = new Linky();
        linky.add(person1);
        linky.add(person2);
        linky.add(person3);
        linky.printLinky();

        System.out.printf("Linky size: %d", linky.size());

        Stacky stacky = new Stacky(5);
        stacky.push("Peter");
        stacky.push("Brian");
        stacky.push("Seth");
        stacky.push("Hector");
        stacky.push("Waltuh");
        System.out.println(stacky);

        System.out.println(stacky.pop());
        System.out.println(stacky);
        System.out.println(stacky.pop());
        System.out.println(stacky);*/


        /*
            Code Challenge: Circular Arr-gument
         */
        Scanner userInput = new Scanner(System.in);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int today = 2;
        LocalDate date = LocalDate.now();


        System.out.printf("The day in 10 days is: %s", weekDays[(today + 10) % weekDays.length]);
        System.out.printf("\nThe day in 20 days is: %s", weekDays[(today + 20) % weekDays.length]);
        System.out.printf("\nToday is %s\nWhat day is it in: ", weekDays[today]);
        int userDay = userInput.nextInt();
        System.out.printf("The day in %d days is %s", userDay, weekDays[(today + userDay) % weekDays.length]);


        /*StringArray stringArray = new StringArray(videoGameCharacters);

        System.out.printf("%d\n", stringArray.size());
        System.out.printf(stringArray.toString());
        stringArray.add(character1);
        System.out.printf("\n%s",stringArray.toString());

        stringArray.add(5, character2);

        System.out.printf("\n%s", stringArray.toString());

        stringArray.reverse();

        System.out.printf("\n%s", stringArray.toString());*/

        //new BigO();



    }

}