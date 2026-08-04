import java.util.Scanner;
class ReverseArray{
    public void reverse(int[] arr){
        int first=0;
        int last=arr.length -1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ReverseArray obj=new ReverseArray();
        obj.reverse(arr);
        System.out.println("Reversed Array: ");
        for(int x:arr){ 
        System.out.print(x+" ");}
        sc.close();
    }
}