package 快速排序;

import java.util.Scanner;

public class 快速排序 {
    public static void quicklysort(int[] arr,int low,int length){
        if(low>length){
            return;
        }
        int i,j,temp,t;
        i=low;
        j=length;
        temp = arr[low];
        for(;i<j;){
            while(temp<=arr[j]&&i<j){
                j--;
            }
            while(temp>=arr[i]&&i<j){
                i++;
            }
            if(i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low] = arr[j];
        arr[j] = temp;
        quicklysort(arr,low,j-1);
        quicklysort(arr,j+1,length);
    }
    public static void main(String[] args) {
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*1000000);
        }
        quicklysort.quicksort2(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//        int c1 = (int)System.currentTimeMillis();
//        quicklysort(a,0,a.length-1);
//        int c2 = (int)System.currentTimeMillis();
//        System.out.println(c2-c1+"ms");
    }
}
