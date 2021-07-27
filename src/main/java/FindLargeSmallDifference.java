import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class FindLargeSmallDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i< arr.length; i++){
            System.out.print("enter number["+(i+1)+"]:");
            arr[i] = sc.nextInt();
        }
         //Method -1 using inbuild class
        /*int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));*/

        //Method -2 using iteration
        int max,min;
        min=arr[0];//assume first element as smallest value
        max=arr[0];//assume first element as largest value
        for(int i=0; i<n; i++){
            if(min>arr[i]){//loop for find minimum elements
                min=arr[i];
            }

            if(max<arr[i]){
                max=arr[i];  //loop for find maximum elements
            }
        }
        System.out.println("Minimum number of array is : "+min);
        System.out.println("Maximum number of array is : "+max);

        int diff;
        diff = max - min;
        System.out.println("----------------------------");
        System.out.print("Difference of max-min = "+diff);

    }
}
