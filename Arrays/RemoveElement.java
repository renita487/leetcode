import java.util.Scanner;
class RemoveElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element to be removed");
        int tar=sc.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=tar){
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println("Elements after removing the given element");
        for(int i=0;i<=j;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println("Number of Unique Elements:"+ (j+1));
        sc.close();
    }
}