package College_Wallah_Array;
import java.util.Scanner;
public class Array_2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search for");
        int N = sc.nextInt();
        int ans = -1;
        for(int i=0;i<n;i++){
            if(array[i]==N){
                ans = i ;
            }
        }
        if(ans>0){
            System.out.println("Found "+N+" at index "+ans);
        }
        else{
            System.out.println(ans);
        }
    }
}