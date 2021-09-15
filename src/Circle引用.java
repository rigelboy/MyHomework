public class Circle引用 {
    public static void main(String[] args){
        Circle cir= new Circle(20);
        double s= cir.getArea();
        int s2=(int)s;
        System.out.println(s2);
        Circle cir2=new Circle(1);
        cir2.setRadius(10);
        double c=cir.getPerimeter();
        System.out.println(c);
    }
}
