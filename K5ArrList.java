import java.util.ArrayList;
import java.util.Scanner;

public class K5ArrList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int list1 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(10);

    //     list.add(78);
    //     list.add(87);
    //     list.add(54);
    //     list.add(574);
    //     list.add(218);
    //     list.add(782);
    //     list.add(21);
    //     list.add(785);
    //     list.add(8732);
    //     list.add(543242);
    //     list.add(5574);
    //     list.add(218);
    //     list.add(78782);
    //     list.add(2901);
    //    // list.clear();
    //    list.set(0, 0);
    //    list.remove(1);
    //    list.add(1, 500);
    //    System.out.print(list.contains(500));
    //    for(int i =0;i<list.size();i++){
    //     System.out.println(i);
    //    }
    //     System.out.println(list);

    for(int i=0;i<5;i++){
      list.add(in.nextInt());
    }
    for(int i =0;i<5;i++){
        System.out.println(list);
    }

    }
    
}
