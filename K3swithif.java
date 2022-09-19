import java.util.Scanner;

class K3switchif{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits  =in.next();
        if(fruits=="mango"){            // in string == means .equals() but chek only values not references
        System.out.println("king");
    }
        if(fruits.equals("grapes")){ 
        System.out.println("juices");
    }
}
}