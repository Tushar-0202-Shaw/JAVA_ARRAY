import java.util.Scanner;
public class Union_Of_Two_Array {
    static void output(int[]arr1 , int[]arr2){
        int i=0 , j=0;
        int m = arr1.length;
        int n = arr2.length;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if (arr1[i]==arr2[j]) {
                System.out.print(arr2[j]+" ");
                i++;
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                j++;
            }
        }
        while(i<m){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<n){
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array :-");
        int m = sc.nextInt();
        System.out.println("Enter size of second array :-");
        int n = sc.nextInt();
        int[]arr1 = new int[m];
        int[]arr2 = new int[n];
        System.out.println("Enter elements for 1st array :-");
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
       System.out.println("Enter elements for 2nd array :-");
            for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("arr1 U arr2 :- ");
        output(arr1,arr2);
    }
}
