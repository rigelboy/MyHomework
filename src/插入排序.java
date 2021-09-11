import java.util.Scanner;

public class 插入排序 {
    public static void main(String[]  args){
        int i=0;
        int k=0,t=0;
        int arr[]=new int[10];
        Scanner s=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            arr[i]=s.nextInt();
        }
        for(i=1;i<10;i++)
        {

            for(int j=i;j>=1;j--){

                if(arr[j]<arr[j-1]){
                    k=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=k;
                }else{
                    break;
                }

            }


        }
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
