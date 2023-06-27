

import java.io.*;
import java.util.HashMap;
import java.util.Map;

	
public class FirstNonRepeatingCharacter {
    
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();
        
       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCounts.get(c) == 1) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        int index = firstUniqChar(s);
        System.out.println(index);
    }
}
