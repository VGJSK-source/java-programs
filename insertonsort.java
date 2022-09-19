import java.util.Scanner;
public class insertonsort {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array :n");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the element of array :");
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("the element of array is:");
    for(int i =0; i<n; i++){
        System.out.println(arr[i]);
    }

    /*//sorting.................
    int j,temp;
    for(int i =0; i<n; i++){

     temp = arrr[0];
     j = i+1;
     while((temp<j) && )



    }*/
    
        
        int i=0,temp =arr[0];
    
        while(i<arr.length){
            if (temp <= arr[i])
                continue;
            else
                temp = arr[i];
        }
     System.out.println("the sorted array is: arr"+ arr[i]);
  }
}
