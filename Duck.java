public class Duck extends Animal implements Flyable{
    @Override
    public void sound(){
        System.out.println("Gaab Quack Gack Gaa");
    }
    public void fly(){
        System.out.println("______");
    }
    public void glides(){
        System.out.println("______");
    }
    public void clean(Animal animal){ //Duck can clean any animal
        System.out.println(this + " is cleaning " + animal);

    }
}
