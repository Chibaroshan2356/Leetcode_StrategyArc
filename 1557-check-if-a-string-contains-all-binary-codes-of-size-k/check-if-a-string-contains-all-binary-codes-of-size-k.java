import java.util.*;

class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = 1 << k;   // 2^k
        
        // Early stopping check
        if (s.length() - k + 1 < total) {
            return false;
        }

        Set<String> set = new HashSet<>();

        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i + k));
            
            // If we already found all codes
            if (set.size() == total) {
                return true;
            }
        }

        return set.size() == total;
    }
}