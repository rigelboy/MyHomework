import java.util.Arrays;
import java.util.Random;


public class AverageWay {
    public static void main(String[] args){




      //定义长度20的数组
        int[] arr=new int[20];

//生成随机数工具类
  Random random = new Random();

//总值
   double sum=0;

            for(int x=0;x<arr.length;x++)
            {//随机生成数放到数组里
                arr[x]=random.nextInt();

//数组求和
                sum+=arr[x];
            }

                System.out.println("该随机生成的数组："+Arrays.toString(arr));

//获取平均值
                double avg=sum/arr.length;

                System.out.println("数组平均值："+avg);

//将数组从小排到大
                Arrays.sort(arr);

                System.out.println("数组最大值："+arr[arr.length-1]);

                System.out.println("数组最小值："+arr[0]);}
    }


