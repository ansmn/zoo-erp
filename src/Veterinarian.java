public class Veterinarian extends Staff{
    public Veterinarian (String name) {
        super(name);
    }

    public void heal (Healable animal) {
        animal.heal();
    }
}
