import java.util.Scanner;

public class zhanzhuanxiangchufa {
   public static void main(String[] args){
       int a;
       int b;
       Scanner s =new Scanner(System.in);
       a= s.nextInt();
       b= s.nextInt();
       int result =getResult(a,b);
       System.out.println(result);
   }
   static int getResult(int a,int b){
       System.out.println(a+"---"+b);
       if(a%b == 0){
           return b;
       }else{
           return getResult(b,a%b);
       }
   }
}
