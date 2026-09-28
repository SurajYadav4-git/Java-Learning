//Given q queries,check if the given number is present in array or not.
//Note:value of all elements in array is less than 10^5

import java.util.*;
public class PresentQuery{

    static int[] makefrequencyarray(int arr[]){
        int freq[]=new int[10005];                
        for(int i=0; i<arr.length; i++){
             freq[arr[i]]++;
        }
        return freq;
    }

 public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Array Size:");
    int n = sc.nextInt();
    int arr[]= new int[n];
    
    System.out.print("Enter "+ n + " elements:");
    for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }
    
    int freq[]= makefrequencyarray(arr);

    System.out.print("Enter number of queries:");
    int q = sc.nextInt();
     
     while(q>0){
        System.out.print("Enter Number to be searched:");
        int x=sc.nextInt();
        if(freq[x]>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        q--;
     }
 }   
}