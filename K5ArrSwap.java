import java.util.Arrays;

public class K5ArrSwap {
    public static void main(String[] args) {
        int[ ] arr ={1,3,5,7,9,11,13,15};
        swap(arr, 0,7);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

    }
    
}
