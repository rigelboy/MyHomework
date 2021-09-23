package 蒙特卡洛方法;

public class MonteCarlo {
    public double getpi(){
        double x,y;
        double N = 100000;
        int sum = 0;
        for(int i = 0;i<N;i++){
            x = Math.random();
            y = Math.random();
            if(x*x+y*y<1){
                sum++;
            }
        }
        return (double) 4*sum/N;
    }
}
