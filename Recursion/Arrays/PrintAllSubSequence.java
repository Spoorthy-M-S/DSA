import java.util.ArrayList;

public class PrintAllSubSequence{
    public static void sub(char arr[],int i,ArrayList<String>ans,ArrayList<Character>ds){
        if(i>=arr.length){
            String ss="";
         for(int j=0;j<ds.size();j++){
            ss+=ds.get(j);
         }
         if(ss.length()>=1){
         ans.add(ss);}
         return;
        }
        ds.add(arr[i]);
        sub(arr,i+1,ans,ds);
        ds.remove(ds.size()-1);
        sub(arr,i+1,ans,ds);
    }
    public static ArrayList<String> subsequences(String str) {
        char arr[]=str.toCharArray();
        ArrayList<String>ans=new ArrayList<>();
        ArrayList<Character>ds=new ArrayList<>();
        sub(arr, 0, ans, ds);
        return ans;
    }
    public static void main(String args[]){
        String arr="abc";
        ArrayList<String>ans=subsequences(arr);
        System.out.println(ans);
    }
}