import java.util.Scanner;

class GetSecondLargest{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }

        System.out.println(getsecondlargest(arr));
        SC.close();
    }

    public static int getsecondlargest(int[] arr){
        int n = arr.length;
        if(n < 2){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i =0; i<n; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }else if((arr[i] > max2 )&& arr[i]!= max){
                max2 = arr[i];
            }
        }

        if(max2 == Integer.MIN_VALUE)
            return -1;
        else
            return max2;

    }
}