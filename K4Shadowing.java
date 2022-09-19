public class K4Shadowing {
    static int x =100; // this is  shadowing variable at line 6
     public static void main(String[] args) {
        System.out.println(x); // 100    
        System.out.println("------  ");//////////this block of scope is overlapping with higher level of variable that x=100
        int x = 60;/////////heigher level of variable hidden by over writing b low level of variable
         // or int x;
         //System.out.println(x);  x is not initialized by any value but declared
         // x = 60;
        System.out.println(x);//60 //local scope
        fun();//100
        
    }
    static void fun(){
       System.out.println(x);
    }
}
