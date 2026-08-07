import java.util.Scanner;
class RemoveEle{
    public int remove(int val,int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value to be removed: ");
        int val=sc.nextInt();
        RemoveEle obj=new RemoveEle();
        int res = obj.remove(val,arr);
        System.out.println("Elements after removing :");
        for(int i=0;i<res;i++){
            System.out.println(arr[i] +" ");
        }
            System.out.println("Total:"+res);

    }
}

