// Find unique number in array where all elements are being repeated twice with one value being unique .Only positive elements. 
import java.util.*;
class Findunique {

    public static int unique(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
         int ans= -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!= -1){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int arr []= new int[n];
        
     System.out.print("Enter "+ n + " Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Unique element:"+ unique(arr));
         }
}