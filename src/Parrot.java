public class Parrot extends Animal implements Feedable, Healable, Cleanable, IAnimalInfoProvider{
    public Parrot(String name, int enclosureNumber) {
        super(name, enclosureNumber);
    }

    @Override
    public void feed() {
        System.out.println("Попугай " + getName() + " накормлен");
    }

    @Override
    public void clean() {
        System.out.println("Вольер №" + getEnclosureNumber() +" попугая " + getName() + " убран");
    }

    @Override
    public void heal() {
        System.out.println("Попугай " + getName() + " осмотрен ветеринаром");
        setMedicalCheckUp(true);
    }

    @Override
    public void getInfo() {
        System.out.println("Попугай: " + getName() + "\nВольер: №" + getEnclosureNumber() + "\nId: " + getAnimalId());
        if (!getMedicalCheckUp()) {
            System.out.println("Не проходил медицинский осмотр\n");
        }
        else if (getMedicalCheckUp()) {
            System.out.println("Прошел медицинский осмотр\n");
        }
    }

}
