
package TopicsDataStructures;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    
    public static void inbulit(ArrayList<Integer> Clist){

    }

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //adding O(1)
        list.add(10);
        list.add(3);
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(0);
        System.out.println(list);

        //add at index O(n)
        list.add(2,4);
        System.out.println(list);

        //delete  at index O(1)
        list.remove(1);
        System.out.println(list);

        //set at index==O(n)
        list.set(4,44);
        System.out.println(list);

        //size of list
        System.out.println(list.size());

        //element present or not
        System.out.println(list.contains(44));

        //get element at index ==O(1)
        System.out.println(list.get(2));
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);





    }
    
}