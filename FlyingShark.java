public class FlyingShark extends Shark implements Flyable {
    @Override
    public void fly() {
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }
    
    // Overloaded eat method สำหรับ Flyable creatures
    public void eat(Flyable creature) {
        System.out.println("FlyingShark caught a flying creature!");
    }
}
