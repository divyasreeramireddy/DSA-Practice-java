//checks if a number is a palindrome or not(works for negative numbers also by converting into absolute value)
class Solution {
    public boolean isPalindrome(int n) {
        // code here
        boolean ispalin=true;
        n = Math.abs(n);
        String s = Integer.toString(n);
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        int digit = Integer.parseInt(rev);
        if(n!=digit){
            ispalin = false;
        }
    return ispalin;
    }
}
