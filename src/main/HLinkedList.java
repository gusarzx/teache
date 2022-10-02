import java.util.LinkedList;

public class HLinkedList {
    public static void main(String[] args) {
        // коолекция LinkedList (часто вносятся изменения)
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(15.62f);
        numbers.add(5.6453f);

        for(Float el : numbers)
            System.out.println(el);
    }
}
