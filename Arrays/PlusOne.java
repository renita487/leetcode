import java.util.Scanner;
class PlusOne{
    public int[] plusOne(int[] nums){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int[] ans=new int[nums.length+1];
        ans[0]=1;
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PlusOne obj=new PlusOne();
        int[] res=obj.plusOne(arr);
        System.out.print("After Plus One: ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        
        sc.close();
    }
}