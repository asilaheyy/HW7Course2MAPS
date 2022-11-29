import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Домашнее задание 2. Задача 2.

        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "A");
        orderedMap.put(3, "B");
        orderedMap.put(4, "C");
        orderedMap.put(1, "D");
        orderedMap.put(7, "E");
        orderedMap.put(2, "F");
        orderedMap.put(6, "G");
        orderedMap.put(9, "H");
        orderedMap.put(8, "I");
        orderedMap.put(10, "J");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d:%s%n", entry.getKey(), entry.getValue());
        }
    }
}