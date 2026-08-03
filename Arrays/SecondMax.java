import java.util.Scanner;
class SecondMax{
    public int[] secmax(int[] arr){
        int largest=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest =arr[i];
            }
            else if(arr[i] > second && arr[i] != largest){
                second=arr[i];
            }
        }
        return new int[]{largest,second};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[n];
        for(int i=00;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SecondMax obj= new SecondMax();
        int[] res=obj.secmax(arr);
        System.out.println("Largest element: "+res[0]);
        System.out.println("Second largest element: "+res[1]);
    }
}