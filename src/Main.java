import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.add(5, 5);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
        List<Integer> nums2 = new ArrayList<>(List.of(1, 8, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> sort = new TreeSet<>();
        for (Integer num : nums2) {
            if (num % 2 == 0) {
                sort.add(num);
            }
        }
        for (Integer evenNum : sort) {
            System.out.print(evenNum + " ");
        }
        System.out.println();
        Set<String> slova = new HashSet<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println(slova);
        System.out.println();
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            System.out.println(wordCountMap);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
