public class Fibonnacci {
    public static void main(String[] arr){
        int[] aar = new int[10];
        int i=2;
        aar[0]=0;
        aar[1]=1;
        System.out.println(aar[1]+"");
        while(i<10){
            aar[i]=aar[i-1]+aar[i-2];
            System.out.println(aar[i]+"");
            i++;
        }
        System.out.println(" ");
    }
}
