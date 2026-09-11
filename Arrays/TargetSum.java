import java.util.*;
public class TargetSum{

    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


  public static int Paircount(int arr [],int target){
     int count= 0;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]+arr[j] == target){
                count++;
            }
        }
    }
       
     return count;
}

public static void main (String Args[]){

    System.out.print("Enter target: ");
    Scanner sc = new Scanner(System.in);
    int target= sc.nextInt();

    System.out.print("Enter array size: ");   
    int n= sc.nextInt();
    int arr[] = new int[n];

    System.out.println("Enter " +  n  + " elements ");
    for(int i = 0; i < n; i++){
    arr[i] = sc.nextInt();
}
      Printarray(arr);

      System.out.println("No of Pairs:" + Paircount(arr,target));
}
}