class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1 = s.toCharArray(); 
        char[] c2 = t.toCharArray();    
        Arrays.sort(c1); 
        Arrays.sort(c2);              
        String sorted1 = new String(c1);
        String sorted2 = new String(c2);
        if(sorted1.equals(sorted2)){
            return true;
        }
        return false;
    }
}