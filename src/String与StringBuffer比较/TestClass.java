package String与StringBuffer比较;

public class TestClass {
    public static void main(String[] args) {
        String s = new String("hello ");
        StringBuffer s1 = new StringBuffer("hello");
        double start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            s = s.concat("hello");
        }
        double end = System.currentTimeMillis();
        System.out.println(s);
        System.out.println(end-start+"ms");
        double start2 = System.currentTimeMillis();
        for(int i=0;i<10000;i++) {
            s1 = s1.append("hello");
        }
        double end2 = System.currentTimeMillis();
        System.out.println(s1);
        System.out.println(end2 - start2+"ms");
    }
}
