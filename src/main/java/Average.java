import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.print("How many number you want Enter: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter the Number"+(i+1)+" :");
            arr[i] = scan.nextDouble();
            total = total + arr[i];
        }

        double average = total/arr.length;
        System.out.println(average);
    }
}
