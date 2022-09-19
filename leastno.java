import java.util.*;
public class leastno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elemnt of array:");
        for(int i =0; i<n; i++)
        arr[i] = sc.nextInt();
       
        sc.close();
        
        System.out.println("the elemnt of array is :");
        for(int i = 0; i<n; i++)
        System.out.print(arr[i]+ " ");

        int i =0;
        int temp =arr[0];
        while(i<arr.length){
            if (temp <= arr[i])
                continue;
            else
                temp = arr[i];
        }

        System.out.println("temp");

    
    }
    
}