public class Lion extends Animal implements Feedable, Healable, Cleanable, IAnimalInfoProvider{
    public Lion(String name, int enclosureNumber) {
        super(name, enclosureNumber);
    }

    @Override
    public void feed() {
        System.out.println("Лев " + getName() + " накормлен");
    }

    @Override
    public void clean() {
        System.out.println("Вольер №" + getEnclosureNumber() +" льва " + getName() + " убран");
    }

    @Override
    public void heal() {
        System.out.println("Лев " + getName() + " осмотрен ветеринаром");
        setMedicalCheckUp(true);
    }

    @Override
    public void getInfo() {
       System.out.println("Лев: " + getName() + "\nВольер: №" + getEnclosureNumber() + "\nId: " + getAnimalId());
       if (!getMedicalCheckUp()) {
           System.out.println("Не проходил медицинский осмотр\n");
       }
       else if (getMedicalCheckUp()) {
           System.out.println("Прошел медицинский осмотр\n");
       }
    }
}
