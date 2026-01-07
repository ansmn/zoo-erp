public abstract class Animal {
    private int animalId;
    private String name;
    private int enclosureNumber;
    private boolean medicalCheckUp;
    private static int counter = 1;

    protected Animal (String name, int enclosureNumber){
        this.animalId = counter++;
        this.name = name;
        this.enclosureNumber = enclosureNumber;
        this.medicalCheckUp = false;
    }

    public int getAnimalId() {
        return this.animalId;
    }

    public String getName() {
        return name;
    }

    public int getEnclosureNumber () {
        return enclosureNumber;
    }

    public void setMedicalCheckUp (boolean medicalCheckUp) {
        this.medicalCheckUp = medicalCheckUp;
    }

    public boolean getMedicalCheckUp () {
        return medicalCheckUp;
    }
}