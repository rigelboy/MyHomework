package 测试;

public class Person {
    int id;
    int age;
    String school;
    public Person(int a,int b,String c){
        id = a;
        age = b;
        school = c;
    }
    public static void main(String[] args) {
        Person p = new Person(1,10,"朝阳");
    }
}
