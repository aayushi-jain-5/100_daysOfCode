public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int n = arr.length;
        int min ;
        for(int i=0;i<arr.length - 1;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
