// find second largest element in given array.Ans will always exist

import java.util.*;

public class Secondlargest{

    static int findmax(int arr[]){
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }

   static int findsecondmax(int arr[]){
    int max=findmax(arr);
    for(int i=0; i<arr.length; i++){
        if(arr[i]==max){
            arr[i]=Integer.MIN_VALUE;
        }
    }

    int secondlargest=(findmax(arr));
    return secondlargest;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n= sc.nextInt();
        int arr[]= new int[n];

        System.out.print("Enter "+ n + " Elements:");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
      
        System.out.print("Second Largest element:"+ findsecondmax(arr));

    }
}