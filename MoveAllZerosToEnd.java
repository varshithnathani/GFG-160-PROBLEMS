import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }


        moveallzerostoEnd(arr);

        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        SC.close();
    }

    public static void moveallzerostoEnd(int arr[]){
        int n = arr.length;
        int count =0;
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                arr[count]=arr[i];
                count++;
            }
        }

        while(count < n){
            arr[count]=0;
            count++;
        }

    }
}
