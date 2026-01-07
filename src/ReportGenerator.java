import java.util.Collection;

public class ReportGenerator {
    public void reportGenerate(Collection <IAnimalInfoProvider> animals) {
        System.out.println("ОТЧЕТ ПО ЖИВОТНЫМ");
        for (IAnimalInfoProvider animal : animals) {
            animal.getInfo();
        }
        System.out.println("Всего животных: " + animals.size() );
    }
}
