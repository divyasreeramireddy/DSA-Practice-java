//Given an array arr[]. Your task is to find the minimum and maximum elements in the array.
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
     Arrays.sort(arr);
    
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(arr[0], arr[arr.length - 1]));

        return list;
    }
}
