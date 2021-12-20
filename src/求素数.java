public class 求素数 {
    public static void main(String[] args) {
        int n,i,m=0;
        double k;
        for(n=101;n<=200;n=n+2){
            k=Math.sqrt(n);
            for(i=2;i<k+1;i++){
                if(n%i==0) break;
                if(i>=k){
                    System.out.print(n+"\t");
                    m=m+1;
                    if(m%5==0) System.out.println();
                }

            }

        }
    }
}
