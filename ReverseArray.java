import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n= SC.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }

        reverseArray(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }

        SC.close();
    }

    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }
    }
    
}
