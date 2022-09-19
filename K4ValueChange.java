public class K4ValueChange {
    public static void main(String[] args) {
        //create array
        int[] arr = {1,2,3,4,5};
         change(arr);
        System.out.println(Array.toString(arr));
    }
    static void change(nums){
        nums[0] = 99; //if u make change to the object via this reference variable,same objectwill be changed
    }
    
}
