package College_Wallah_Array;
import java.util.Scanner;
public class Array_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    int temp ;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp ;
                }
            }
        }
        System.out.println("Array elements after sorting :- ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("2nd largest element in the given set of array :- "+array[n-2]);
    }
}