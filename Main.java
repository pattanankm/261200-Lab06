public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
//            Duck donald = new Duck();
//            //Animal donald = new Duck(); // Can
//            //Duck daisy = new Animal() // Can not do this
//            Duck daisy = new Duck();
//            Owl hedwig = new Owl();
//            daisy.clean(donald);
//            donald.clean(daisy);
//            donald.clean(hedwig);
//
//            ///Duck pd = new PekingDuck();
//            PekingDuck pd = new PekingDuck();
//            pd.clean(hedwig);

        Duck duck1 = new Duck();
        PekingDuck duck2 = new PekingDuck();
        Duck duck3 = new PekingDuck();

        duck1.clean(duck2);
        duck2.clean(duck1);
        //duck3.clean(duck1);
        duck1.clean(new Bat()); // We call anonymous object
        //duck1.clean(Bat);
    }
}
