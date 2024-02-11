public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr=new int[x];
        print(arr,x,0);
        return arr;
    }
    public static void print(int[]arr ,int x,int i){
        if(x==0)return;
        print(arr,x-1,i+1);

        arr[i]=x;


    }
}
