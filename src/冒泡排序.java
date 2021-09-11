import java.util.Scanner;

public class 冒泡排序 {
    public static void main(String[] args){
        int arr[]=new int[10];
        Scanner s=new Scanner(System.in);
        int i=0;
        int k=0;
        for(i=0;i<10;i++){
            arr[i]=s.nextInt();
        }
        for(i=9;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    k=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=k;
                }
            }
        }
        for(i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
