//gives an array with consecutive integers from 1 to n find the missing element in array
class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
       int n = arr.length;
       if(arr[0]!=1){
           return 1;
       }
           for(int i =0;i<n-1;i++){
               if(arr[i+1]!=arr[i]+1){
                 return arr[i]+1;
               }
           }
       return arr[n-1]+1;
    }
}
