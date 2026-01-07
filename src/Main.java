import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Симба", 45));
        animals.add(new Parrot("Каро", 10));
        animals.add(new Lion("Зефирка", 46));
        animals.add(new Parrot("Гарик", 15));

        Cleaner Misha = new Cleaner("Миша");
        Feeder Tanya = new Feeder("Таня");
        Veterinarian Sveta = new Veterinarian("Света");

        ReportGenerator report = new ReportGenerator();

        for (Animal animal : animals) {
            if (animal instanceof Cleanable)
                Misha.clean((Cleanable) animal);
            if (animal instanceof Feedable)
                Tanya.feed((Feedable) animal);
            if (animal instanceof Healable)
                Sveta.heal((Healable) animal);
            System.out.println();
        }

        List <IAnimalInfoProvider> infoAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof IAnimalInfoProvider)
                infoAnimals.add((IAnimalInfoProvider) animal);
        }

        report.reportGenerate(infoAnimals);
    }
}