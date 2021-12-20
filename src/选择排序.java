public class 选择排序 {
    public static void sortArr(int[] arr){
        int k=0,temp;
        for(int i=0;i<arr.length;i++){
            k=i;
            for(int j=i;j<arr.length-i;j++){
                if(arr[k]>arr[j]){
                    k=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,8,4,32,34};
        sortArr(arr);
    }
}
