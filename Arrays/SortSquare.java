/* Given an integer array sorted in non-decreasing order,return an array of the squares 
   of each number sorted in non-decreasing order*/

import java.util.*;

public class SortSquare{

    public static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void swaparray(int arr[],int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

 public static void reverse(int arr[]){
    int i=0, j=arr.length-1;
    while(i<j){
        swaparray(arr,i,j);
    i++;
    j--;
    }
 }

    public static int[] sortSquare(int arr[]){
        int n=arr.length;
        int left=0, right= n-1;
        int ans[]= new int[n];
        int k=0;
        while(left<=right){
        if(Math.abs(arr[left]) > Math.abs(arr[right])){
            ans[k++]= arr[left]*arr[left];
            left++;
        }else{
            ans[k++]=arr[right]*arr[right];
            right--;
        }
    }
    return ans;
    }

    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=sc.nextInt();
       int arr[]=new int [n];
      System.out.print("Enter "+ n + " Elements:");
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }

      System.out.println("Original Array");
      printarray(arr);

    System.out.println("Sorted Array");
     int ans[]=sortSquare(arr);
     reverse(ans);
     printarray(ans);
    }
}
