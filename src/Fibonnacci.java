public class Fibonnacci {
    public static void main(String[] arr){
        int axx[] = new int[10];
        int i=2;
        axx[0]=0;
        axx[1]=1;
        System.out.println(axx[1]+"");
        while(i<10){
            axx[i]=axx[i-1]+axx[i-2];
            System.out.println(axx[i]+"");
            i++;
        }
        System.out.println(" ");
    }
}
