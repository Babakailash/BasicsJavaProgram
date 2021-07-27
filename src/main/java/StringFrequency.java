import java.util.Scanner;

public class StringFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String str = sc.nextLine();

        int[] freq = new int[str.length()];
        int i, j;
        char[] chars = str.toCharArray();

        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for (i=0; i<freq.length; i++){
            if(chars[i] != ' ' && chars[i] != '0'){
                System.out.print(chars[i]+ "-"+ freq[i]+" ");
            }
        }
    }
}