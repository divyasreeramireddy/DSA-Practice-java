/*find if a number is Armstrong or not.
A number is an Armstrong number if the sum of its digits, 
each raised to the power of the number of digits, is equal to the original number itself.
Example 1: 153
Number of digits = 3
Digits: 1, 5, 3
13 + 53 + 33 = 153. */
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        boolean isarmstrong = true;
        int count = 0;
        String s = Integer.toString(n);
        while(n>0){
        for(int i=0;i<s.length();i++){
            int digit = s.charAt(i)-'0';
            count = count + ((int)Math.pow(digit,s.length()));
        }
        }
        if(n!=count){
            isarmstrong = false;
        }
    return isarmstrong;
    }
}
