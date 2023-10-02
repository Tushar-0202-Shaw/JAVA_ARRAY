package College_Wallah_Array;
import java.util.Scanner;
public class Array_8 {
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
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        int result = 0;
        for(int i=0;i<n;i++){
            if(array[i]>0){
                result = array[i];
            }
        }
        System.out.println("Unique number in the given set of array :- "+result);
    }
}