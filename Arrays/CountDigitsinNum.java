//count the number of digits present in a number
class Solution {
    static int evenlyDivides(int n) {
        // code here
       String s = Integer.toString(n);
       int count = 0;
       for(int i=0;i<s.length();i++){
           int digit = s.charAt(i)-'0';
           if(digit!=0){
               if(n%digit==0){
                   count++;
           }
       }
       return count;
    }
}
