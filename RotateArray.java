import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }
        int d = SC.nextInt();

        rotateArray(arr, d);

        System.out.println(Arrays.toString(arr));
        SC.close();
    }

    public static void rotateArray(int[] arr, int d){
        int n = arr.length;
        d = d%n;

        reverse(arr, 0, n-1);

        reverse(arr, 0, n-d-1);

        reverse(arr, n-d, n-1);

    }


    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }

}
