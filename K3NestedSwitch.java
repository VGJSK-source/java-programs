import java.util.Scanner;

public class K3NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int EmpId = sc.nextInt();
        String Department = sc.next();
        switch(EmpId){
              case 1 -> System.out.println("He");
              case 2 -> System.err.println("She");
              case 3 ->{
                System.out.println("EmpId is 3");
                switch(Department){
                    
                            case "it"-> System.out.println("information technolgy department");
                            case "me" -> System.out.println("mechanical department");
                            default -> System.out.println("invalid department");
                        }
            }

        
             case 4 -> System.out.println("it");
             default -> System.out.println("enter valid value");
             
    }
    
  }
}
