import java.util.*;
import java.util.Arrays;
public class Ascsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of element");
        int n = sc.nextInt();

        int arr[] =  new int[n];
        System.out.println("enter the elements of array");
        for(int i =0 ; i<n; i++)
            arr[i] = sc.nextInt();

        sc.close();
       
        Arrays.sort(arr);
        System.out.println("array in aescendng");
        for(int k =0 ; k<n; k++)
        System.out.print(arr[k]+" ");

        int j = arr.length;
        while (j>0) {
            System.out.println(arr[j]);
        }
    }
    
}
