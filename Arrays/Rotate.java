// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Rotate {

    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    static int[] rotatearray(int arr[], int k){
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for (int i=n-k;i<n; i++){
            ans[j++]=arr[i];
        }

        for(int i=0; i<=n-k-1; i++){
            ans[j++]=arr[i];     
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
         System.out.print("Enter Array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+n+" elements:");
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
        }

         System.out.print("Enter k:");
        int k=sc.nextInt();
        
         System.out.println("Original array");
          printarray(arr);

        int ans[]=rotatearray(arr,k);
        
         System.out.println("Array after rotation");
          printarray(ans);

    }
}