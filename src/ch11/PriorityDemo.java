package ch11;

public class PriorityDemo extends Thread{
    private String name;
    public PriorityDemo(String name) {
        super(name);
        this.name = name;
    }
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"第"+i+"次运行");
            Thread.yield();//让出CPU执行权
        }
    }
    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("kia1");
        PriorityDemo t2 = new PriorityDemo("kia2");
        PriorityDemo t3 = new PriorityDemo("kia3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();t2.start();t3.start();
    }
}
