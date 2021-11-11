package 快速排序;

public class quicksort {
    static  void quicksort1(int[] arr, int low,int length){
        if(low>length){
            return;
        }
        int i,j,temp,t;
        i=low;
        j=length;
        temp=arr[low];
        while(i<j){
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
        arr[low] = arr[i];
        arr[i] = temp;
        quicksort1(arr,low,j-1);
        quicksort1(arr,j+1,length);
    }
}
