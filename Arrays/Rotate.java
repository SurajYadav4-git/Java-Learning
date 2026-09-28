
import java.util.*;
class Rotate {

    static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
 //Rotate the given array by k steps ,where k is non negative
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

// Roatate array without using extra space

static void swap(int arr[],int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
     }

   static void reverse(int arr[], int i, int j){
      while(i<j){
                 swap(arr,i,j);
                 i++;
                 j--;
        
                 }       
        }

  
   static void rotateinplace(int arr[],int k){
    int n=arr.length;
     k = k%n;
    reverse(arr,0,n-k-1);
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-1);
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

       /* int ans[]=rotatearray(arr,k);
        
         System.out.println("Array after rotation");
          printarray(ans); */

          rotateinplace(arr,k);
        
         System.out.println("Array after rotation");
          printarray(arr);

    }
}