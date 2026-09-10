class Solution {
    public int maxVowels(String s, int k) {
        int maxi;
        int count = 0;

        
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        maxi = count;

        
        for (int j = k; j < s.length(); j++) {
            if (isVowel(s.charAt(j - k))) {   
                count--;
            }
            if (isVowel(s.charAt(j))) {       
                count++;
            }
            maxi = Math.max(maxi, count);
        }

        return maxi;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}