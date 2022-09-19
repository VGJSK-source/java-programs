import java.util.concurrent.locks.Condition;

public class K2condition {
    public static void main(String[] args){

        // if(Condition){
        //     body
        // }
        // else   body


        int salary = 7367897;
        // if(salary>10000){
        //     salary = salary+5000;
        // }
        // else{
        //     salary = salary+2000;
        // }



          // multiple if else

        if(salary>20000){
           salary+=10000;
        }
         else if(salary>50000){
            salary+=50000;
         }
        else{
            salary+=300000;
        }


        System.out.println(salary);




    }
    
}
