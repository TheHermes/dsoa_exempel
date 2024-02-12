
import javax.swing.plaf.synth.SynthIcon;
import java.util.ArrayList;

public class Linky {

    Node first;
    Node last;

    private static class Node {
        Person person;
        Node next;
        Node(Person person, Node next) {
            this.person = person;
            this.next = next;
        }
    }

    public void add(Person person) {
        Node node = new Node(person, null);
        if (first == null) first = node;
        if (last != null) last.next = node;
        last = node;
    }

    public int size() {
        int count = 0;

        Node n = first;

        while (n != null) {
            n = n.next;
            count++;
        }

        return count;
    }

    public void printLinky() {
        System.out.print("Linky: ");
        Node n = first;
        while (n != null) {
            System.out.print(n.person.getName() + ", ");
            n = n.next;
        }
        System.out.println("");
    }
}
