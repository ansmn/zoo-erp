public class Cleaner extends Staff{
    public Cleaner (String name) {
        super(name);
    }

    public void clean(Cleanable animal) {
        animal.clean();
    }
}
