import java.util.*;                          // Collections classes use karne ke liye

public class FirstNonRepeating {
    public static void main(String[] args) {

        String s = "swiss";                  // Input string

        Map<Character, Integer> map =
                new LinkedHashMap<>();       // LinkedHashMap: order maintain + frequency store

        for (char c : s.toCharArray())       // String ko characters me convert karke loop
            map.put(c,                       // Character ko key ke roop me store
                    map.getOrDefault(c, 0)   // Agar key exist karti hai to count lo,
                    + 1);                    // nahi karti to 0 leke +1 kar do

        for (Map.Entry<Character, Integer> e : map.entrySet()) { // Map ko insertion order me traverse
            if (e.getValue() == 1) {          // Jo character sirf 1 baar aaya
                System.out.println(e.getKey()); // Wahi first non-repeating character print
                break;                        // Sirf FIRST chahiye, isliye loop stop
            }
        }
    }
}
