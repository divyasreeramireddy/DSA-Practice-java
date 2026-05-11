//find all the divisors of a given number.
import java.util.*;
public class Solution {
    public static List<Integer> printDivisors(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
