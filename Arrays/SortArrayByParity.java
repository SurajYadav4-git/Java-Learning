/*Given an array of Integers'a',move all the even Integers at beginning followed by all odd integers.
The relative order of odd of even doesn't matter.*/

import java.util.*;
public  class SortArrayByParity{

public static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
       arr[b]= temp;
    }

    public static void SortArrayByParity(int arr[]){
        int n= arr.length;
        int left= 0, right = n-1;
        while(left< right){

            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
                right--;
            }
        }
    }

    public static void main(String Args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Array Size:");
    int n = sc.nextInt();
    int arr[]= new int[n];

    System.out.print("Enter "+ n +" Elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

     System.out.println("Array Before Sort");
     printarray(arr);
  
   System.out.println("Sorted Array");
   SortArrayByParity(arr);
     printarray(arr);
}
}