package TopicsDataStructures;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array list size:");
        int n=sc.nextInt();

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        ArrayList<Integer> list5=new ArrayList<>();

        for(int i=1;i<=n;i++){
            list1.add(i);
            list2.add(2*i);
            list3.add(3*i);
            list4.add(4*i);
            list5.add(5*i);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        mainList.add(list4);
        mainList.add(list5);

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>curr=mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();

        }

        System.out.println(mainList);


        

    }
    
}
