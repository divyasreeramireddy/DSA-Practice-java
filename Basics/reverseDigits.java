//print the reverse of a number by eliminatinng leading zeroes if any.
class Solution {
    public int reverseDigits(int n) {
        // Code here
        String rev="";
        String s = Integer.toString(n);
        for(int i=s.length()-1;i>=0;i--){
           rev = rev + s.charAt(i);
        }
        int ans = Integer.parseInt(rev);
        return ans;
    }
}
