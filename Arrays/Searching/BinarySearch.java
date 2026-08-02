import java.util.Scanner;
class BinarySearch{
    public int binarySearch(int arr[],int target){
        int low=0;
        int high=(arr.length)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter sorted elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target: ");
        int tar=sc.nextInt();
        BinarySearch obj=new BinarySearch();
        int res=obj.binarySearch(arr,tar);
        if(res==-1){
            System.out.println("Element not found");

        }
        else{
            System.out.println("Element found at index "+res);
        }
        sc.close();
    }
}