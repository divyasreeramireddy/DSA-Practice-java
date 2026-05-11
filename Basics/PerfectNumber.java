/*Given a number n, check if the number is perfect or not. A number is said to be perfect 
if sum of all its factors excluding the number itself is equal to the number.
  Input: n = 6
Output: true 
Explanation: Factors of 6 are 1, 2, 3 and 6. 
Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.*/
class Solution {
    static boolean isPerfect(int n) {
        // code here
        int count = 1;
        if(n==1){
            return false;
        }
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            count+=i;
            if(i != n / i){
                    count += n / i;
            }
        }
    }
    return n == count;
    }
}
