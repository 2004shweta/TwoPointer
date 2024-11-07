class Solution {
    public int characterReplacement(String s, int k) {
        int r;
        int l = 0;
        int maxcount = 0;
        int maxlen = 0;
        int[] arr = new int[26];
        for (r = 0; r < s.length(); r++) {
            arr[s.charAt(r) - 'A']++;

            maxcount = Math.max(maxcount, arr[s.charAt(r) - 'A']);

            while (r - l + 1 - maxcount > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}
