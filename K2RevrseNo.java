class K2RevrseNo {
    public static void main(String[] args) {
        int n = 76775658;
        int reverse =0;
         //int count =0;
         System.out.println("nikhil");
         while(n>0){
            int rem =  n%10;
            n/=10;
            reverse = reverse*10 + rem;
           // System.out.println(reverse);
         }
        System.out.println(reverse);

    }
    
}
