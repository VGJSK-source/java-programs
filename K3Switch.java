import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class K3Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // switch(str){
        //     case "mango":
        //     System.out.println("king");
        //     break;
        //     case "banana":
        //     System.out.println("muscule");
        //     break;
        //     case "apple":
        //     System.out.println("mind");
        //     break;
        //     case "orange":
        //     System.out.println("yello");
        //     break;
        //     default:
        //     System.out.println("enter a valid string");
        // }
        int day = sc.nextInt();
        switch(day){
                  case 1 -> System.out.println("monday");
                  case 2 -> System.out.println("tueday");
                  case 3 -> System.out.println("wedday");
                  case 4 -> System.out.println("thurday");
                  case 5 -> System.out.println("friday");
                  case 6 -> System.out.println("saturday");
                  case 7 -> System.out.println("sunday");



        }

        if(day==1){ 
        System.out.println("monday");
        }
        else if (day==2) {
            System.out.println("tuesday");
        }
        else if(day==3){
            System.out.println("wednesday");
        }
        else if(day==4){
            System.out.println("thursday");
        }
        else if(day==5){
            System.out.println("friday");
        }
        else if(day==6){
            System.out.println("saturday");
        }
        else if(day==7){
            System.out.println("sunday");
        }
        else {
            System.out.println("invalid number");
        }



      switch(day){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        System.out.println("working day");
        break;
        case 6:
        case 7:
        System.out.println("weekend");
        break;
        default:
        System.out.println("entre vali data");

      }
       
      switch(day){ 
      case 1,2,3,4,5 -> System.out.println("office day");
      case 6,7       -> System.out.println("holiday");
      }

    }
    
    
}
