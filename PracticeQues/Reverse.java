// Reverse the given array

class Reverse {

static void printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

// using new array 

    static int[] reversearrray(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for(int i=n-1; i>=0; i--){
            ans[j]=arr[i];
            j++;

        }
        return ans;
    }

    //reverse the array inplaced

     static void swaparray(int arr[],int i,int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
     }

     static void reversearrayinplaced(int arr[]){
          int i=0, j=arr.length-1;
          while(i<j){
          swaparray(arr,i,j);
          i++;
          j--;
          }
          
     }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
      //  int ans[]=reversearrray(arr);
      //  printarray(ans);
       
       reversearrayinplaced(arr);
       printarray(arr);
    }
}
