import java.util.Scanner;
class MergeSortedArray{
    public void merge(int arr1[],int m,int arr2[],int n){
        int i=m-1;
        int j=n-1;
        int k=m+n -1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
            }
            k--;
        }
        while(j>=0){                                   //copy remaining elements of array 2 to 1
            arr1[k]=arr2[j];
            j--;
            k--;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size for array 1 : ");
        int m=sc.nextInt();
        System.out.println("Enter size for array 2 : ");
        int n=sc.nextInt();
        int[] arr1=new int[m+n];
        int[] arr2=new int[n];
        System.out.println("Enter sorted elements of array1 :");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter sorted elements of array2 : ");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        MergeSortedArray obj=new MergeSortedArray();
        obj.merge(arr1,m,arr2,n);
        System.out.println("Merged Sorted Array: ");
        for(int i=0;i<m+n;i++){
            System.out.println(arr1[i]+"");
        }
        sc.close();
    }
}