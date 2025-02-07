import java.util.*;

public class CollectionSortingExample {
    public static void main(String[] args) {
        sortList();
        sortTreeSet();
        sortHashSet();
        sortTreeMap();
    }

    public static void sortList() {
        List<String> names = new ArrayList<>(Arrays.asList("Zara", "John", "Alice", "Bob"));

        Collections.sort(names);
        System.out.println("Sorted List (Ascending): " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + names);
    }

    public static void sortTreeSet() {
        Set<Integer> numbers = new TreeSet<>(Arrays.asList(5, 2, 9, 1, 3));
        System.out.println("Sorted TreeSet (Ascending): " + numbers);
    }

    public static void sortHashSet() {
        Set<String> names = new HashSet<>(Arrays.asList("Zara", "John", "Alice", "Bob"));

        List<String> sortedList = new ArrayList<>(names);
        Collections.sort(sortedList);
        System.out.println("Sorted HashSet as List: " + sortedList);
    }

    public static void sortTreeMap() {
        Map<Integer, String> students = new TreeMap<>();
        students.put(103, "Alice");
        students.put(101, "John");
        students.put(102, "Bob");

        System.out.println("Sorted TreeMap by Key: " + students);
    }
    }

