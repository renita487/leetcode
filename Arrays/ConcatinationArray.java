import java.util.Scanner;

class ConcatenationArray {

    public int[] carray(int[] arr) {

        int[] ans = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
            ans[i + arr.length] = arr[i];
        }

        return ans;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ConcatenationArray obj = new ConcatenationArray();

        int[] result = obj.carray(arr);

        System.out.println("Concatenated Array:");

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}