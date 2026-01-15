import java.util.*;

public class LC0049_GroupAnagrams {

    // Groups strings that are anagrams of each other
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        // Process each word
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            // Convert word to sorted key
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // Add to map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0049_GroupAnagrams sol = new LC0049_GroupAnagrams();

        System.out.print("Enter number of strings: ");
        int n = input.nextInt();
        input.nextLine();

        String[] strs = new String[n];
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = input.nextLine();
        }

        List<List<String>> result = sol.groupAnagrams(strs);

        for (List<String> group : result) {
            for (String s : group) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
