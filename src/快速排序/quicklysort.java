package 快速排序;

public class quicklysort {
    public static void quicksort2(int a[],int first,int last){
        if(first>last){
            return ;
        }
        int i,j,t,temp;
        i=first;
        j=last;
        temp=a[first];
        while(i<j){
            while(a[j]>=a[first]&&i<j){
                j--;
            }
            while(a[i]<=a[first]&&i<j){
                i++;

            }
            if(i<j){
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        a[first]=a[i];
        a[i]=temp;
        quicksort2(a,first,j-1);
        quicksort2(a,j+1,last);
    }
}
