

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String args[]){
        ArrayList<Double> list=new ArrayList<>();

        //add
        list.add(7.3);
        list.add(6.9);
        list.add(4.7);
        list.add(9.44);
        System.out.println(list);

        //get
        Double element = list.get(2);
        System.out.println(element);

        //add at index 1
        list.add(1,8.0);
        System.out.println(list);

        //set
        list.set(0,12.64);
        System.out.println(list);

        //remove/delete
        list.remove(3);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println("size is :"+size);

        //loop
        for(int i=0;i<list.size();i++){
            
            System.out.print(list.get(i)+",");
        }
        System.out.println();

        //sort
        Collections.sort(list);
        System.out.println(list);

        //Reverse sort/descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
/*
  I am writing this email to inform you that I mistakenly selected Pallavi Shetty as my mentor.
   Now, I would like to change it to Mangala Shetty. Therefore, please accept my request.
 */