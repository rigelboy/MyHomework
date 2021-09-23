package 蒙特卡洛方法;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }//构造方法
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }
}
