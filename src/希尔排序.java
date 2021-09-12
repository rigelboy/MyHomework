import java.util.Scanner;

public class 希尔排序 {
    public static void main(String[] args){
        int[] arr=new int[10];
        int gap,k;
        Scanner s =new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
        }
        for(gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                while(j-gap>=0&&arr[j]<arr[j-gap]){
                    k=arr[j];
                    arr[j]=arr[j-gap];
                    arr[j-gap]=k;
                    j-=gap;
                }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
