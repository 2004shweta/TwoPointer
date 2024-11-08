
class Solution {
    public static int totalFruits(Integer[] fruits) {
        // code here
        int left = 0;
        int maxFruits = 0;
        HashMap<Integer, Integer> basket = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
          
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

           
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }

         
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
