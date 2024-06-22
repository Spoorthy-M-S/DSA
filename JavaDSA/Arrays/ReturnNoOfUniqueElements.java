package JavaDSA.Arrays;
import java.util.*;

public class ReturnNoOfUniqueElements {

    public static int unqele(ArrayList<Integer> arr,int n) {
		// Write your code here.
		HashSet<Integer> s=new HashSet<>();
		for(int i=0;i<n;i++){
			s.add(arr.get(i));
		}
		return s.size();
	
}

public static void main(String args[]){
    ArrayList<Integer> list=new ArrayList<>();
    list.add(2);

     list.add(2);
      list.add(9);
       list.add(6);
    int a=unqele(list,list.size());
    System.out.println(a);
}
    
}
