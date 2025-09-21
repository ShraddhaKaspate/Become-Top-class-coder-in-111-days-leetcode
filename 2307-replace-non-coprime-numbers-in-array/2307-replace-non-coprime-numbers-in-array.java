import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> stack = new ArrayList<>();

        for (int n : nums) {
            stack.add(n);

            while (stack.size() > 1) {
                int a = stack.get(stack.size() - 1);
                int b = stack.get(stack.size() - 2);

                // find gcd in simplest way
                int x = a, y = b;
                while (y != 0) {
                    int t = x % y;
                    x = y;
                    y = t;
                }
                int g = x;

                if (g == 1) break;

                // lcm
                int lcm = (a / g) * b;

                // remove last 2 and put lcm
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                stack.add(lcm);
            }
        }
        return stack;
    }
}
