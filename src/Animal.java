public interface Animal {
   public abstract void cry();
   public  abstract void getAnimalName();
}
class DOG implements Animal{
   public  void cry() {
        System.out.println("汪汪");
    }
    public void getAnimalName(){
        System.out.println("DOG");
    }
}
class Cat implements Animal{
    public void cry(){
        System.out.println("喵喵");
    }
    public void getAnimalName(){
        System.out.println("Cat");
    }
}
class Simulator{
    void playSound(Animal animal){
        animal.cry();
        animal.getAnimalName();
    };

}
class Application {
    public static void main(String[] args) {
        Simulator simulator=new Simulator();
        simulator.playSound(new DOG());
        simulator.playSound(new Cat());
    }
}
