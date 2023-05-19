

public class Q2 {
    public static void main(String[]args){
 int a=10;
 int b=0;
 int c;
 try{
    c=a/b;
 }  
   catch(Exception e){
      int d=8;
      c=a/d;
      System.out.println("The answer should be: "+ c);
   } 
   finally
   {
    System.out.println("It will occur anyhow ");
   }
}
}

