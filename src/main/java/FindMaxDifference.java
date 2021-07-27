import java.util.Scanner;

public class FindMaxDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i< arr.length;i++){
            System.out.print("enter the value ["+(i+1)+"] = ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i]-arr[i+1]>max){
                max = arr[i]-arr[i+1];
            }
        }
        System.out.println("\ndifference = "+max);
    }
}
