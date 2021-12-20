package step3;

public class MyThread extends Thread {
    //请在此添加实现代码
    /********** Begin **********/
    private String str;
    public MyThread(String str){
        this.str=str;
    }
    public static void main(String[] args) throws Exception {
        MyThread myt1 = new MyThread("E");
        MyThread myt2 = new MyThread("D");
        MyThread myt3 = new MyThread("U");
        myt1.start();
        myt2.start();
        myt3.start();
    }

    /********** End **********/
    public void run(){
        for(int i = 0 ;i<5;i++){
            System.out.print(str);
            Thread.yield();
        }
    }
}