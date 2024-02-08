import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {

        String[] videoGameCharacters = {"Mario", "Luigi", "Link", "Zelda", "Princess Peach", "Bowser", "Yoshi", "Donkey Kong", "Samus Aran", "Kirby", "Fox McCloud", "Pikachu"};

        String character1 = "Sonic";
        String character2 = "Shadow";

        Person person1 = new Person("Shadow");
        Person person2 = new Person("Nelf", person1);
        Person person3 = new Person("Sailer", person2);
        Person current = person2;
        while (current.next != null) {

        }

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