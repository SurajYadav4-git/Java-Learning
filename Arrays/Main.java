class Arraysum{

    int sum( int arr[]){
    int ans=0;
    for(int i=0; i<arr.length; i++){
        ans=ans + arr[i];
    }
     return ans;
    }
}


class Maxarray{
   int maximum(int arr[]){
    int max= 0;
    for(int i=0; i<arr.length; i++){
        if (arr[i]> max){
            max = arr[i];
        }
    }
    return max;
}
}

 public class Main{
    public static void main (String args[]){
        int arr[] = {1,5,3};
        //Arraysum obj= new Arraysum();
         //System.out.println(obj.sum(arr));
        Maxarray obj= new Maxarray();
        System.out.println(obj.maximum(arr));
     
    }
    }

