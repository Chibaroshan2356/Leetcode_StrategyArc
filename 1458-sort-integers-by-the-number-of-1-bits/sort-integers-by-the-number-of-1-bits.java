import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        
        // Convert int[] to Integer[] for custom sorting
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);
            
            if (bitA == bitB) {
                return a - b;   // sort by value if bits equal
            }
            
            return bitA - bitB;  // sort by bit count
        });

        // Convert back to int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}