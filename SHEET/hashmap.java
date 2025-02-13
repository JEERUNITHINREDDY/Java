import java.util.*;

public class hashmap {
    public static boolean anagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (hm.get(ch) != null) {
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                } else {
                    hm.put(ch, hm.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static void main(String args[]) {
        String s = "abcf";
        String t = "bcfA";
        System.out.println(anagram(s, t));
    }
}