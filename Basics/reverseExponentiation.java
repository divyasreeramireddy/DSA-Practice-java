//You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.
class Solution {
    public int reverseExponentiation(int n) {
        // code here
        String rev = "";
        String s = Integer.toString(n);
        for(int i=s.length()-1;i>=0;i--){
            rev =  rev + s.charAt(i);
        }
        int digit = Integer.parseInt(rev);
        int ans = (int)Math.pow(n,digit);
    return ans;
    }
}


