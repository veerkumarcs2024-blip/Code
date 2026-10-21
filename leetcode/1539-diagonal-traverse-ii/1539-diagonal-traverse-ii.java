import java.util.*;

class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue<int[]> queue = new LinkedList<>();
        List<Integer> resultList = new ArrayList<>();
        
        // Step 1: Start with the first cell (row=0, col=0)
        queue.add(new int[]{0, 0});
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            
            // Step 2: Add current element to result list
            resultList.add(nums.get(r).get(c));
            
            // Step 3: Agar ye current row ka PEHLA element hai (col == 0),
            // toh holds responsibility to push the element directly BELOW it.
            if (c == 0 && r + 1 < nums.size()) {
                queue.add(new int[]{r + 1, c});
            }
            
            // Step 4: Push the element directly to the RIGHT (if it exists)
            if (c + 1 < nums.get(r).size()) {
                queue.add(new int[]{r, c + 1});
            }
        }
        
        // Step 5: Convert result List to int array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}