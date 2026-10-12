import java.util.*;
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> ans = new ArrayList<>();
        int  discriminant = b * b - 4 * a* c;
        
        //Imagination roots
        if (discriminant < 0) {
            ans.add(-1);
            return ans;
        }
        
        double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
        
        if (root1 >= root2) {
            ans.add((int) Math.floor(root1));
            ans.add((int) Math.floor(root2));
        } else {
            ans.add((int) Math.floor(root1));
            ans.add((int) Math.floor(root2));
        }
        return ans;
    }
}