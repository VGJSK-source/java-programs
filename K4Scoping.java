import javax.sql.rowset.spi.SyncResolver;
import javax.swing.text.MaskFormatter;

public class K4Scoping {
public static void main(String[] args) {
    int a =10;
    int b =20;

    // block scope 
    {
        int a =48;//con not intialize again if already initialized in outer block
        
        a =1009; // but can be change the value
        System.out.println(a);//reasign value will be print
        int c = 876;

    }

    System.out.println(c);// not will run b/c it's out side of block
      // every variable will run in it's own block


   //System.out.println(mark); it will not work here becuuse mark is the variable of other function
}
 for(int i =0;i<6;i++){
    System.out.println(i);
 }
 System.out.println(i);//not run b/c it's outside of for loop



static void random(int mark){
    mark = 92;
    System.out.println(mark);
}

}
whtever is defined can be used in own block starting to ending.
but if any variable is initialized out side of any block that 's value can be changed in inner block'
