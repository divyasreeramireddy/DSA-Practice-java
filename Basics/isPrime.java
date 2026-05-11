//check if given number is prime or not
class Solution {
    static boolean isPrime(int n) {
        // code here
        boolean isprime = true;
        if(n==2){
            isprime =true;
        }
        if(n==1){
            isprime = false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            isprime = false;
            }
        }
    return isprime;
    }
}
