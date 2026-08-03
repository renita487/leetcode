import java.util.Scanner;
class MoveZeroes{
    public void movezeroes(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            
        }
        while(j<arr.length){
                arr[j]=0;
                j++;

            }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MoveZeroes obj=new MoveZeroes();
        obj.movezeroes(arr);
        System.out.println("After moving Zeroes:");
        for(int x: arr){
            System.out.print(x+" ");

        }
        sc.close();
    }
}