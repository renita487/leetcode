import java.util.Scanner;
class RemoveDuplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int j=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        System.out.println("Array after removing Duplicates:");
        for(int i=0;i<=j;i++){
                System.out.println(arr[i]+" ");
        }
        System.out.println();
        System.out.println("No.of.Unique Elements:"+ (j+1));
        sc.close();


    }
}