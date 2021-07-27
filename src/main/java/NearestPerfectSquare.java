import java.util.Scanner;

public class NearestPerfectSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array: ");
        int number = sc.nextInt();

//        for (int i = 0; i < number; i++) {
//            System.out.print("Enter the Number"+(i+1)+": ");
//            number = sc.nextInt();
//        }
        System.out.println("<----------------------->");
       // for (int i = 0; i < number; i++) {
            System.out.print(" "+is_Perfect_Square(number)+" ");
      // }
    }
    public static boolean is_Perfect_Square(int number){
       int x = number % 10;
        if(x ==2 || x==3 || x==7 || x==8){
            return false;
        }
        for(int i = 0; i<=number/2+1; i++){
            if((long) i*i == number){
                return true;
            }
        }
        return false;
    }
}
