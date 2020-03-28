import java.util.*;

public class Examples {
    public static void main(String[] args) {
        Collection<Integer> integers = new LinkedList<>();
        System.out.println(integers.isEmpty());
        integers.add(5);
        integers.add(7);
        System.out.println(integers.toString());
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());
        integers.remove(5);
        System.out.println(integers.toString());
    }
}
