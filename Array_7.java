package College_Wallah_Array;
import java.util.Scanner;
public class Array_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int T = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]+array[j]==T){
                    System.out.println(array[i]+" + "+array[j]+" = "+T);
                    count++;
                }
            }
        }
        System.out.println("Ans :- "+count);
    }
}