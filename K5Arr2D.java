import java.util.Arrays;
import java.util.Scanner;

public class K4Arr2D {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] arr = new int[3][2];
    System.out.println(arr.length);// print no. of row
     int row;
     int col;
    for( row=0; row<arr.length;row++){
        for( col=0;col<arr[row].length;col++){
            arr[row][col]= in.nextInt();
        }

    }
//     for( row=0; row<arr.length;row++){
//         for( col=0;col<arr[row].length;col++){
//            // arr[row][col]= in.nextInt();
        

    
//     //int col;
//     System.out.print(arr[row][col] + " ");
//     } System.out.println();
// }
    for(row=0;row<arr.length;row++){
        System.out.println(Arrays.toString(arr[row]));
    }
    
}    
}
