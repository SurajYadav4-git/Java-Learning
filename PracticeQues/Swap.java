// Swapping two values 

class Swap {

    //  using temporary variable  
   static void swapping1(int a, int b){
       
       System.out.println("Before Swap");
       System.out.println("a:"+a);
       System.out.println("b:"+b);
      
       int temp = a;
       a = b;
       b = temp;

       System.out.println("After Swap");
       System.out.println("a:"+a);
       System.out.println("b:"+b);
   }

    //without using temporary variable
     static void swapping2(int a, int b){
       
       System.out.println("Before Swap");
       System.out.println("a:"+a);
       System.out.println("b:"+b);
      
       a = a + b;
       b = a - b;
       a = a - b;

       System.out.println("After Swap");
       System.out.println("a:"+a);
       System.out.println("b:"+b);
   }
  
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
    //  swapping1(a,b);
        swapping2(a,b);
        
    }
}