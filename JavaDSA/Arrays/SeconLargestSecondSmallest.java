package JavaDSA.Arrays;

import java.lang.reflect.Array;

import java.util.*;

public class SeconLargestSecondSmallest {
    public static ArrayList secondLS(int arr[]){
          int largest=arr[0];
        int seclargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }
            if(arr[i]>seclargest && arr[i]<largest){
                seclargest=arr[i];
            }
        }
            int smallest=arr[0];
            int secsmallest=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<smallest){
                    secsmallest=smallest;
                    smallest=arr[i];
                }
                if(arr[i]<secsmallest && arr[i]>smallest){
                    secsmallest=arr[i];

                }

            }
            ArrayList <Integer>r=new ArrayList<>();
            r.add( secsmallest);
            r.add(seclargest);

            return r;


    }

    public static void main(String args[]){
        int arr[]={4,3,2,6,3,1};
        System.out.println(secondLS(arr));
      

        
    }
    
}
