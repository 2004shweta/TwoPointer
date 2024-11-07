class Solution {
    public int numberOfSubstrings(String s) {
        int r,l=0;
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r), 0) + 1);
            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0){
                count+=s.length()-r;
            
      
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                
                
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            
        }
        return count;
    }
}
