// find first repeated element in Array 
import java.util.*;
class FirstRepeat{

   static int repeatfirst(int arr[]){
       for(int i=0; i<arr.length; i++){
           for(int j=i+1;j<arr.length; j++){
               if(arr[i]==arr[j]){
                   return arr[i];
               }
          }
       }
       return -1;
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
        System.out.print("First Repeated element:"+ repeatfirst(arr));
         }
}