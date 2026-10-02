//Sort the given array of 0 and 1 in ascending order  

import  java.util.*;
public class SortZeroesAndOnes{


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

// normal approach 
/*
public static void SortZeroesAndOnes(int arr[]){
    int n = arr.length;
    int zeroes= 0;
    for(int i=0; i<n; i++){
        if(arr[i]==0){
            zeroes++;     
           }
    }

    for(int i=0; i<n; i++){
        if(i < zeroes){
            arr[i]=0;
        }else{
            arr[i]=1;
        }
        
    }
}
*/

// Two pointer Approach

public static void SortZeroesAndOnes(int arr[]){
    int n=arr.length;
    int left=0, right=n-1;
    while(left<right){

        if(arr[left]==1 && arr[right]==0){
            swap(arr,left,right);
            left++;
            right--;
        }
        if(arr[left]==0){
            left++;
        }
        if(arr[right]==1){
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
   SortZeroesAndOnes(arr);
     printarray(arr);
}
}