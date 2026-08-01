import java.util.Scanner;
class frequency{
    public boolean anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int freq[]= new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freq[ch -'a']--;

        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s= sc.next();
        System.out.println("Enter second String: ");
        String t = sc.next();
        frequency obj=new frequency();
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