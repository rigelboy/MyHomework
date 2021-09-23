package 蒙特卡洛方法;

public class 测试类 {
    public static void main(String[] args){
        Circle cir = new Circle(3);
        System.out.println("cir的面积="+cir.getArea());
        Rectangle rec =new Rectangle(4,5);
        System.out.println("rec的周长"+rec.getPerimeter());
        Shape sae =(Shape) cir;
    }
}
