import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
public class Solution {
     public static List<Integer> collidingAsteroids(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0) {
                stack.add(asteroid);
            } else {
                while (true) {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.add(asteroid);
                        break;
                    }
                    int peek = stack.peek();
                    if (peek == -asteroid) {
                        stack.pop();
                        break;
                    } else if (peek > -asteroid) {
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        if(asteroids[0]==0)result.add(asteroids[0]);
        result.addAll(stack);
        return result;
    }
}
