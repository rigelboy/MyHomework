import java.util.Scanner;

public class for4xyear {
    public static void main(String[] arr){
        int num=0;
        int year;
        Scanner s =new Scanner(System.in);
        System.out.println("请输入年份");
        year=s .nextInt();
        for(int i=year;i<=year+100;i++)
        {
            // 可以被4整除，不被100整除    或者     可以被400整除的是闰年
            if((i%4==0&&i%100!=0)||(i%400==0)){
                num++;

            }
        }
        System.out.println(num);

    }
}
