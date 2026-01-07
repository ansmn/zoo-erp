public class Feeder extends Staff{
    public Feeder (String name) {
        super(name);
    }

    public void feed(Feedable animal) {
        animal.feed();
    }
}
