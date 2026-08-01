import java.util.Arrays;
import java.util.Scanner;
class sorting{
    public boolean anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char first[]=new char[s.length()];      //char first[]=s.toCharArray();
        char second[]=new char[t.length()];       //char second[]=t.toCharArray();
        for (int i=0;i<s.length();i++){
            first[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            second[i]=t.charAt(i);
        }                                       /////
        Arrays.sort(first);
        Arrays.sort(second);
        for(int i=0;i<first.length;i++){
            if(first[i]!=second[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first string: ");
         String s=sc.next();
         System.out.println("Enter second string: ");
         String t=sc.next();
         sorting obj=new sorting();
         boolean result=obj.anagram(s,t);
         if(result){
            System.out.println("Anagram");
         }
         else{
            System.out.println("Not a Anagram");
         }
         sc.close();
    }
}