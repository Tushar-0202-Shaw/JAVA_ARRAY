import java.util.Scanner;
public class Stock_Buy_And_Sell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" stock :-");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[j]-arr[i])>max){
                    max = arr[j]-arr[i];
                }
            }
        }
        System.out.println("Max Profit :- "+max);
    }
}
