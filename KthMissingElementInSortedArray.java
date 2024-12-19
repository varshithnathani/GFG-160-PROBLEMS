import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KthMissingElementInSortedArray {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = SC.nextInt();
        }

        int k = SC.nextInt();
        System.out.println(findKthElement(arr, k));

        SC.close();
    }

    public static int findKthElement(int[] arr, int k ){
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        }

        int current = 0;
        int count = 0;

        while(count < k){
            current++;  

            if(!set.contains(current)){
                count++;
            }
        }

        return current;
    }
}
