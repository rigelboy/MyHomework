import java.util.Scanner;
public class moreForAverage {


        public static void main(String[] args) {
            System.out.println("请你输入一个数字a（其中a代表要输入数的个数）：");//输入一个数字a
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int[] arr=new int[a];                    //首先,定义一个数组
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();	             //输入数组元素
            }for(int i:arr) {                        // i:arr翻译成i在数组arr里面
                sum+=i;                              //加法运算
            }int pj;                                 //定义一个平均值用(pj)代表
            pj=sum/a;	                             //求出平均值

            if(a>pj) {                                   //if语句判断
                System.out.println(a);                   //输出结果
            }
        }


}
