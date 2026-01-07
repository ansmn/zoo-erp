public abstract class Staff {
    private int staffId;
    private String name;
    private static int counter = 1;

    protected Staff (String name){
        this.staffId = counter++;
        this.name = name;
    }

    public int getStaffId() {
        return this.staffId;
    }

    public String getName() {
        return name;
    }


}
